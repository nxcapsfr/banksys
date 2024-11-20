package com.XYZBank.BankSys.Service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.time.LocalDate;
import java.util.List;

import com.XYZBank.BankSys.Entity.TransactionEntity;
import com.XYZBank.BankSys.Entity.UserEntity;
import com.XYZBank.BankSys.Repository.TransactionRepository;
import com.XYZBank.BankSys.Repository.UserRepository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BankStatement {

    private TransactionRepository transactionRepository;
    private UserRepository userRepository;


    public List<TransactionEntity> generateStatement(String accountNumber, String startDate, String endDate) {
        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = LocalDate.parse(endDate);
        List<TransactionEntity> transactionEntityList = transactionRepository.findAll().stream().filter(transactionEntity -> transactionEntity.getAccountNumber().equals(accountNumber))
                .filter(transactionEntity -> transactionEntity.getCreatedAt().isEqual(start))
                .filter(transactionEntity -> transactionEntity.getCreatedAt().isEqual(end))
                .toList();

        return transactionEntityList;
    }





}
