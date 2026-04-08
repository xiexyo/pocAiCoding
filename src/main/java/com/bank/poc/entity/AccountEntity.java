package com.bank.poc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_account")
public class AccountEntity {

    @Id
    @Column(name = "account_no", length = 32, nullable = false)
    private String accountNo;

    @Column(name = "customer_id", length = 32, nullable = false)
    private String customerId;

    @Column(name = "account_name", length = 64, nullable = false)
    private String accountName;

    @Column(name = "account_type", length = 32, nullable = false)
    private String accountType;

    @Column(name = "product_code", length = 32, nullable = false)
    private String productCode;

    @Column(name = "currency", length = 8, nullable = false)
    private String currency;

    @Column(name = "balance", precision = 18, scale = 2, nullable = false)
    private BigDecimal balance;

    @Column(name = "account_status", length = 16, nullable = false)
    private String accountStatus;

    @Column(name = "branch_code", length = 16)
    private String branchCode;

    @Column(name = "open_date", nullable = false)
    private LocalDateTime openDate;

    @Column(name = "created_time", nullable = false)
    private LocalDateTime createdTime;

    @Column(name = "updated_time", nullable = false)
    private LocalDateTime updatedTime;
}