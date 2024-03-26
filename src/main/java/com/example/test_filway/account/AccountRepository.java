package com.example.test_filway.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.hateoas.EntityModel;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
//    Optional<Account> findById(long id);
//    void deleteById(Integer id);
//    Account save(Account account);
}
