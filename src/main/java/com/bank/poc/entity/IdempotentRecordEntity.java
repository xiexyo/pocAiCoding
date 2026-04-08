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
@Table(name = "t_idempotent_record")
public class IdempotentRecordEntity {

    @Id
    @Column(name = "request_id", length = 64, nullable = false)
    private String requestId;

    @Column(name = "business_type", length = 32, nullable = false)
    private String businessType;

    @Column(name = "business_key", length = 64)
    private String businessKey;

    @Column(name = "process_status", length = 16, nullable = false)
    private String processStatus;

    @Column(name = "response_code", length = 16)
    private String responseCode;

    @Column(name = "response_message", length = 255)
    private String responseMessage;

    @Column(name = "created_time", nullable = false)
    private LocalDateTime createdTime;

    @Column(name = "updated_time", nullable = false)
    private LocalDateTime updatedTime;
}