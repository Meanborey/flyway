package com.example.test_filway.account;

import com.example.test_filway.account.web.UpdateAccountDto;
import com.example.test_filway.base.BaseApi;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.hateoas.EntityModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{
    private final AccountRepository accountRepository;


    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account getAccountById(long id) {
        return accountRepository.findById(Math.toIntExact(id)).orElseThrow(() -> new EntityNotFoundException("Account not found"));
    }

    @Override
    public Account updateAccountById(Long id, UpdateAccountDto updateAccountDto) {
        return null;
    }

    @Override
    public void deleteAccountBY(Long id) {

    }

    @Override
    public List<Account> findAllAccounts() {
        return null;
    }
}
