package com.hungry5656.ecommerce_s.userservice.repository.dao;

import jakarta.persistence.*;
import lombok.*;


/**
 * @author: Sizhuo Sun
 * @date: 2024-03-28
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ACCOUNT")
@Builder
public abstract class Account extends BaseDataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "USER_ID", updatable = false, nullable = false)
    private String userId;

    @Column(name = "USER_NAME", nullable = false)
    private String userName;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "BUSINESS_FLAG", nullable = false)
    private Boolean businessFlag;

    public Account(String userName, String password, String firstName, String lastName, String email, Boolean businessFlag) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.businessFlag = businessFlag;
    }

}
