package com.amrendra.repository;

import com.amrendra.model.Accounts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends CrudRepository<Accounts, Long> {
    Accounts findByCustomerID(int customerID);
}
