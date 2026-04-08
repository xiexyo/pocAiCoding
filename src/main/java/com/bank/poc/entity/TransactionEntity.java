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
@Table(name = "t_transaction")
public class TransactionEntity {

    @Id
    @Column(name = "txn_id", length = 32, nullable = false)
    private String txnId;

    @Column(name = "request_id", length = 64, nullable = false)
    private String requestId;

    @Column(name = "debit_account_no", length = 32)
    private String debitAccountNo;

    @Column(name = "credit_account_no", length = 32)
    private String creditAccountNo;

    @Column(name = "txn_type", length = 32, nullable = false)
    private String txnType;

    @Column(name = "txn_status", length = 16, nullable = false)
    private String txnStatus;

    @Column(name = "amount", precision = 18, scale = 2, nullable = false)
    private BigDecimal amount;

    @Column(name = "remark", length = 255)
    private String remark;

    @Column(name = "txn_time", nullable = false)
    private LocalDateTime txnTime;

    @Column(name = "created_time", nullable = false)
    private LocalDateTime createdTime;
}