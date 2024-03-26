package com.example.test_filway.customer.web;

import lombok.Builder;

import java.awt.*;

@Builder
public record CustomerDto(int id,
                          String uuid,
                          String name,
                          String gender){
}
