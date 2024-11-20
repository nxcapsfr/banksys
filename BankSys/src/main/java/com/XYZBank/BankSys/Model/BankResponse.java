package com.XYZBank.BankSys.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BankResponse {

    private String reponseCode;
    private String responseMessage;
    private AccountModel accountModel;
}
