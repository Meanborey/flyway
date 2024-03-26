package com.example.test_filway.account;

import com.example.test_filway.account.web.AccountDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    Account toEntity(Account account);
    AccountDto mapAccountToAccountDto(Account account);

    List<AccountDto> mapListAccountToListAccount(List<Account> accounts);

}
