package com.hungry5656.ecommerce_s.userservice.repository.dao;

import jakarta.persistence.*;
import lombok.*;


/**
 * @author: Sizhuo Sun
 * @date: 2024-04-02
 */
public class ConsumerAccount extends Account {
    public ConsumerAccount(String userName, String password, String firstName, String lastName, String email, Boolean businessFlag) {
        super(userName, password, firstName, lastName, email, businessFlag);
        this.setBusinessFlag(Boolean.FALSE);
    }
}
