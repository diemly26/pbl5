package com.pbl.pbl_be.dto;


import lombok.Data;

@Data
public class PaymentRequestDTO {
    private Long amount;
    private Integer projectId;
    private Integer userId;
}
