package com.XYZBank.BankSys.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserModel {

    private String userFirstName;

    private String userLastName;

    private String userGender;

    private String userAddress;

    private String userMobileNumber;

    private String userEmail;

    private String userStatus;

    private BigDecimal accountBalance;
}
