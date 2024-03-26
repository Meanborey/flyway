package com.example.test_filway.account.web;

import lombok.Builder;

@Builder
public record AccountDto(long id,
                         String name,
                         String email,
                         String password) {
}
