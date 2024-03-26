package com.example.test_filway.account;

import com.example.test_filway.account.web.UpdateAccountDto;
import org.springframework.hateoas.EntityModel;

import java.util.List;

public interface AccountService {
    Account getAccountById(long id);
    Account updateAccountById(Long id, UpdateAccountDto updateAccountDto);
    void deleteAccountBY(Long id);

    List<Account> findAllAccounts();
}
