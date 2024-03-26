package com.example.test_filway.customer;

import com.example.test_filway.customer.web.CreateNewCustomerDto;
import com.example.test_filway.customer.web.CustomerDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
    Customer toEntity(CreateNewCustomerDto createNewCustomerDto);
    CustomerDto mapCustomerToCustomerDto(Customer customer);

}
