package com.hungry5656.ecommerce_s.userservice.service;

import com.hungry5656.ecommerce_s.userservice.web.CreateAccountRequest;
import com.hungry5656.ecommerce_s.userservice.web.CreateAccountResponse;
import com.hungry5656.ecommerce_s.userservice.web.GetAccountTokenRequest;
import com.hungry5656.ecommerce_s.userservice.web.GetAccountTokenResponse;


/**
 * @author: Sizhuo Sun
 * @date: 2024-03-28
 */
public interface AccountService {
    CreateAccountResponse registerAccount(CreateAccountRequest request);

    GetAccountTokenResponse loginAccount(GetAccountTokenRequest getAccountTokenRequest);
}
