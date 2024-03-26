package com.example.test_filway.customer;

import com.example.test_filway.customer.web.CreateNewCustomerDto;
import com.example.test_filway.customer.web.CustomerDto;
import com.example.test_filway.customer.web.CustomerUpdateDto;

import java.util.List;

public interface CustomerService {
    Customer createCustomer(CreateNewCustomerDto createNewCustomer);

    CustomerDto findCustomerByUuid(String uuid);

    Customer updateCustomer(String uuid, CustomerUpdateDto customerUpdateDto);

    void deleteCustomer(String uuid);

    List<Customer>findAllCustomers();

}
