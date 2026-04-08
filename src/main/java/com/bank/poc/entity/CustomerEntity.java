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
@Table(name = "t_customer")
public class CustomerEntity {

    @Id
    @Column(name = "customer_id", length = 32, nullable = false)
    private String customerId;

    @Column(name = "customer_name", length = 64, nullable = false)
    private String customerName;

    @Column(name = "cert_type", length = 16, nullable = false)
    private String certType;

    @Column(name = "cert_no", length = 32, nullable = false)
    private String certNo;

    @Column(name = "mobile", length = 20, nullable = false)
    private String mobile;

    @Column(name = "customer_status", length = 16, nullable = false)
    private String customerStatus;

    @Column(name = "risk_level", length = 16)
    private String riskLevel;

    @Column(name = "created_time", nullable = false)
    private LocalDateTime createdTime;

    @Column(name = "updated_time", nullable = false)
    private LocalDateTime updatedTime;
}