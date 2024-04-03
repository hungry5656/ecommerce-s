package com.hungry5656.ecommerce_s.userservice.service.impl;

import com.hungry5656.ecommerce_s.userservice.repository.AccountRepository;
import com.hungry5656.ecommerce_s.userservice.repository.dao.Account;
import com.hungry5656.ecommerce_s.userservice.repository.dao.ConsumerAccount;
import com.hungry5656.ecommerce_s.userservice.service.AccountService;
import com.hungry5656.ecommerce_s.userservice.web.CreateAccountRequest;
import com.hungry5656.ecommerce_s.userservice.web.CreateAccountResponse;
import com.hungry5656.ecommerce_s.userservice.web.GetAccountTokenRequest;
import com.hungry5656.ecommerce_s.userservice.web.GetAccountTokenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;


/**
 * @author: Sizhuo Sun
 * @date: 2024-03-28
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    // TODO: param checking implementation required
    @Override
    public CreateAccountResponse registerAccount(CreateAccountRequest request) {

        // check if the email is already been registered
        if (accountRepository.existsByEmail(request.getEmail())){
            throw new RuntimeException("user already existed");
        }
        Account newAccount = new ConsumerAccount(
             request.getUserName(),
             request.getPassword(),
             request.getFirstName(),
             request.getLastName(),
             request.getEmail(),
             request.getBusinessFlag());

        // encrypt password using B Crypt
        newAccount.setPassword(passwordEncoder.encode(newAccount.getPassword()));

        // save to database and the result back with the generated UserId
        Account savedAccount = accountRepository.save(newAccount);

        return CreateAccountResponse.builder()
                .userId(savedAccount.getUserId())
                .userName(request.getUserName())
                .build();
    }

    @Override
    public GetAccountTokenResponse loginAccount(GetAccountTokenRequest getAccountTokenRequest) {
        // TODO: implement login account logic and return jwt logic

        if (accountRepository.existsByEmail(getAccountTokenRequest.getEmail())) {
            throw new RuntimeException("user does not exist");
        }


        String clientSecret = UUID.randomUUID().toString();
        String encodedSecret = passwordEncoder.encode(clientSecret);
        return null;
    }
}
