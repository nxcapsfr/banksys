package com.XYZBank.BankSys.Repository;

import com.XYZBank.BankSys.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Boolean existsByUserEmail(String email);
    Boolean existsByAccountNumber(String accountNumber);
    UserEntity findByAccountNumber(String accountNumber);
}
