package com.example.test_filway.customer.web;

import lombok.Builder;

@Builder
public record CreateNewCustomerDto(int id,
                                   String uuid,
                                   String name,
                                   String gender) {
}
