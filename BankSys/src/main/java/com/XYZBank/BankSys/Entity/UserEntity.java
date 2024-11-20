package com.XYZBank.BankSys.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String userFirstName;

    private String userLastName;

    private String userGender;

    private String userAddress;

    private String accountNumber;

    private String userMobileNumber;

    private String userEmail;

    private BigDecimal accountBalance;

    private String userStatus;

    @CreationTimestamp
    private LocalDateTime userCreatedAt;

    @UpdateTimestamp
    private LocalDateTime userModifiedAt;

}
