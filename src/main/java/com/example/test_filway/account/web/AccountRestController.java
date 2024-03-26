package com.example.test_filway.account.web;
import com.example.test_filway.account.AccountService;
import com.example.test_filway.base.BaseApi;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountRestController {

private final AccountService accountService;


    public AccountRestController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/{id}")
    public BaseApi<?> getAccountById(@PathVariable("id") int id){
        return BaseApi.builder()
                .code(HttpStatus.OK.value())
                .data(accountService.getAccountById(id))
                .message("Process successfully!!!!!!")
                .status(true)
                .timeStamp(LocalDateTime.now())
                .build();
    }

}
