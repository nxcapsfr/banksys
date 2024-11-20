package com.XYZBank.BankSys.Repository;

import com.XYZBank.BankSys.Entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity, String> {
}
