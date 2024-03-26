package com.example.test_filway.customer.web;

import com.example.test_filway.base.BaseApi;
import com.example.test_filway.customer.Customer;
import com.example.test_filway.customer.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1/customers")
@Slf4j
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
  public BaseApi<?> createCustomer(@RequestBody CreateNewCustomerDto createNewCustomerDto) {
        Customer customer = customerService.createCustomer(createNewCustomerDto);
    return BaseApi.builder()
            .code(HttpStatus.OK.value())
            .data(customer)
            .message("Post Customer Success")
            .status(true)
            .timeStamp(LocalDateTime.now())
            .build();
  }
  @GetMapping("/{uuid}")
    public BaseApi<?> findCustomerByUuid(@PathVariable("uuid") String uuid) {
        return BaseApi.builder()
                .code(HttpStatus.OK.value())
                .data(customerService.findCustomerByUuid(uuid))
                .message("Get Customer By Uuid Success")
                .status(true)
                .timeStamp(LocalDateTime.now())
                .build();
    }
    @PutMapping("/{uuid}")
    public BaseApi<?> updateCustomer(@PathVariable("uuid") String uuid, @RequestBody CustomerUpdateDto customerUpdateDto) {
        System.out.println("uuid = " + uuid);
        return BaseApi.builder()
                .code(HttpStatus.OK.value())
                .data(customerService.updateCustomer(uuid, customerUpdateDto))
                .message("Update Customer Success")
                .status(true)
                .timeStamp(LocalDateTime.now())
                .build();
    }
    @DeleteMapping("/{uuid}")
    public BaseApi<?> deleteCustomer(@PathVariable("uuid") String uuid) {
        customerService.deleteCustomer(uuid);
        return BaseApi.builder()
                .code(HttpStatus.OK.value())
                .message("Delete Customer Success")
                .status(true)
                .timeStamp(LocalDateTime.now())
                .build();
    }
    @GetMapping("/all")
    public BaseApi<?> findAllCustomers() {
        return BaseApi.builder()
                .code(HttpStatus.OK.value())
                .data(customerService.findAllCustomers())
                .message("Get All Customers Success")
                .status(true)
                .timeStamp(LocalDateTime.now())
                .build();
    }


}
