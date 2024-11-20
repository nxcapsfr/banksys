package com.XYZBank.BankSys.Utils;

import java.time.Year;

public class Accountutils {

    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static final String ACCOUNT_NOT_EXISTS_CODE = "002";
    public static final String ACCOUNT_CREATED_CODE = "003";
    public static final String ACCOUNT_FOUND_CODE = "004";
    public static final String ACCOUNT_CREDIT_SUCCESS_CODE = "005";
    public static final String ACCOUNT_DEBIT_SUCCESS_CODE = "006";
    public static final String INSUFFICIENT_BALANCE_CODE = "007";
    public static final String ACCOUNT_TRANSFER_SUCCESS_CODE = "008";

    public static final String ACCOUNT_EXISTS_MESSAGE = "This user already has an account created";
    public static final String ACCOUNT_NOT_EXISTS_MESSAGE = "This account number doesn't exists";
    public static final String ACCOUNT_CREATED_MESSAGE = "The user was successfully created";
    public static final String ACCOUNT_FOUND_MESSAGE = "User with Account Number Found";
    public static final String ACCOUNT_CREDIT_SUCCESS_MESSAGE = "Amount was successfully credited to Account";
    public static final String ACCOUNT_DEBIT_SUCCESS_MESSAGE = "Amount was successfully debited from Account";
    public static final String INSUFFICIENT_BALANCE_MESSAGE = "Amount to be debited is more than the current balance";
    public static final String ACCOUNT_TRANSFER_SUCCESS_MESSAGE = "Amount Transfer was successful";

    public static String generateAccountNumber(){
        Year currentYear = Year.now();
        //generate Number
        int randNumber = (int) Math.floor((Math.random()*100000)+100000);
        //Concatenate year + random number to get account number
        StringBuilder accountNumber = new StringBuilder();
        return accountNumber.append(String.valueOf(currentYear)).append(String.valueOf(randNumber)).toString();
    }


}
