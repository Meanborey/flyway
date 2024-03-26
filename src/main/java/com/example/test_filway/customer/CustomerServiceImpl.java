package com.example.test_filway.customer;

import com.example.test_filway.customer.web.CreateNewCustomerDto;
import com.example.test_filway.customer.web.CustomerDto;
import com.example.test_filway.customer.web.CustomerUpdateDto;
import com.fasterxml.jackson.databind.util.BeanUtil;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

import static com.fasterxml.jackson.databind.util.BeanUtil.*;

@Service
public class CustomerServiceImpl implements CustomerService{
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    public Customer createCustomer(CreateNewCustomerDto createNewCustomerDto) {
            Customer customer = CustomerMapper.INSTANCE.toEntity(createNewCustomerDto);
            customer.setUuid(UUID.randomUUID().toString());
        return customerRepository.save(customer);
    }

    @Override
    public CustomerDto findCustomerByUuid(String uuid) {
        Customer customer = (Customer) customerRepository.findByUuid(uuid).orElseThrow();
        return customerMapper.mapCustomerToCustomerDto(customer);
    }

    @Override
    public Customer updateCustomer(String uuid, CustomerUpdateDto customerUpdateDto) {
        Customer customer = (Customer) customerRepository.findByUuid(uuid).orElseThrow(()->new EntityNotFoundException("Customer not found"));
        BeanUtils.copyProperties(customerUpdateDto,customer);
        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(String uuid) {
        Customer customer = (Customer) customerRepository.findByUuid(uuid).orElseThrow(()->new EntityNotFoundException("Customer not found"));
        customerRepository.delete(customer);
    }

    @Override
    public List<Customer> findAllCustomers() {
        var customers = customerRepository.findAll();
        return customers;
    }

}
