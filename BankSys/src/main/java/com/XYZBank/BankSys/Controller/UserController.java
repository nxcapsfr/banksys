package com.XYZBank.BankSys.Controller;

import com.XYZBank.BankSys.Model.*;
import com.XYZBank.BankSys.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    UserService userService;

//    @GetMapping("/")
//    public String helloWorldTest(){
//        return "Hello World testing";
//    }
    
    @PostMapping
    public BankResponse createAccount(@RequestBody UserModel userModel){
        return userService.createAccount(userModel);
    }

    
    @GetMapping("/balanceEnquiry")
    public BankResponse balanceEnquiry(@RequestBody EnquiryRequest request){
        return userService.balanceEnquiry(request);
    }

    
    @GetMapping("/nameEnquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest request){
        return userService.nameEnquiry(request);
    }

    
    @PostMapping("/credit")
    public BankResponse creditAccount(@RequestBody CreditDebitRequest request){
        return userService.creditAccount(request);
    }

    
    @PostMapping("/debit")
    public BankResponse debitAccount(@RequestBody CreditDebitRequest request){
        return userService.debitAccount(request);
    }

    
    @PostMapping("/transfer")
    public BankResponse transferAccount(@RequestBody TransferRequest request){
        return userService.transferAmount(request);
    }

}
