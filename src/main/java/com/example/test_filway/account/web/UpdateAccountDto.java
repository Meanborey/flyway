package com.example.test_filway.account.web;

import lombok.Builder;

@Builder
public record UpdateAccountDto (long id,
                                String name,
                                String email,
                                String password){
}
