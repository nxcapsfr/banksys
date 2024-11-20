package com.XYZBank.BankSys.Service;

import com.XYZBank.BankSys.Model.*;

public interface UserService {

    BankResponse createAccount(UserModel userModel);
    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);
    BankResponse creditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);
    BankResponse transferAmount(TransferRequest request);

}
