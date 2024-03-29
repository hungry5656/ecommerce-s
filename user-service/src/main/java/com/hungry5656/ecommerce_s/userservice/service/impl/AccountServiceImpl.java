package com.hungry5656.ecommerce_s.userservice.service.impl;

import com.hungry5656.ecommerce_s.userservice.service.AccountService;
import com.hungry5656.ecommerce_s.userservice.web.CreateAccountRequest;
import com.hungry5656.ecommerce_s.userservice.web.CreateAccountResponse;
import com.hungry5656.ecommerce_s.userservice.web.GetAccountTokenRequest;
import com.hungry5656.ecommerce_s.userservice.web.GetAccountTokenResponse;
import org.springframework.stereotype.Service;


/**
 * @author: Sizhuo Sun
 * @date: 2024-03-28
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public CreateAccountResponse registerAccount(CreateAccountRequest request) {
        // TODO: implement register account logic in database
        return null;
    }

    @Override
    public GetAccountTokenResponse loginAccount(GetAccountTokenRequest getAccountTokenRequest) {
        // TODO: implement login account logic and return jwt logic
        return null;
    }
}
