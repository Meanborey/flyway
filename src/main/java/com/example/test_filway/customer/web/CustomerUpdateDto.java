package com.example.test_filway.customer.web;

import lombok.Builder;

@Builder
public record CustomerUpdateDto(String name,
                                String gender) {
}
