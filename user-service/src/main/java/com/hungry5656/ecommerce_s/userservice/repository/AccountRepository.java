package com.hungry5656.ecommerce_s.userservice.repository;

import com.hungry5656.ecommerce_s.userservice.repository.dao.Account;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


/**
 * @author: Sizhuo Sun
 * @date: 2024-03-28
 */
@Repository
@Transactional
public interface AccountRepository extends CrudRepository<Account, Long> {

    Optional<Account> findByUserNameOrEmail(String userName, String eMail);

    Optional<Account> findByUserId(String userId);

    void deleteByUserId(String userId);

    Boolean existsByEmail(String email);
}
