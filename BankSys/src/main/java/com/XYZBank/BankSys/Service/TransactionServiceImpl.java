package com.XYZBank.BankSys.Service;

import com.XYZBank.BankSys.Entity.TransactionEntity;
import com.XYZBank.BankSys.Model.TransactionModel;
import com.XYZBank.BankSys.Repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService{

    @Autowired
    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }


    @Override
    public void saveTransaction(TransactionModel transactionModel) {
        TransactionEntity transactionEntity = TransactionEntity.builder()
                .amount(transactionModel.getAmount())
                .transactionType(transactionModel.getTransactionType())
                .accountNumber(transactionModel.getAccountNumber())
                .accountStatus("SUCCESS")
                .build();
        transactionRepository.save(transactionEntity);
    }
}
