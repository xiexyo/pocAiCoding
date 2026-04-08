package com.bank.poc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_product")
public class ProductEntity {

    @Id
    @Column(name = "product_code", length = 32, nullable = false)
    private String productCode;

    @Column(name = "product_name", length = 128, nullable = false)
    private String productName;

    @Column(name = "product_type", length = 32, nullable = false)
    private String productType;

    @Column(name = "currency", length = 8, nullable = false)
    private String currency;

    @Column(name = "sale_status", length = 16, nullable = false)
    private String saleStatus;

    @Column(name = "account_level", length = 16, nullable = false)
    private String accountLevel;

    @Column(name = "created_time", nullable = false)
    private LocalDateTime createdTime;

    @Column(name = "updated_time", nullable = false)
    private LocalDateTime updatedTime;
}