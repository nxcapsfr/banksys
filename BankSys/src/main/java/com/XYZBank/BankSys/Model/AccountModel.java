package com.XYZBank.BankSys.Model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountModel {

    @Schema(name = "User Account Name")
    private String accountName;

    @Schema(name = "Account Balance")
    private BigDecimal accountBalance;

    @Schema(name = "User Account Number")
    private String accountNumber;

}
