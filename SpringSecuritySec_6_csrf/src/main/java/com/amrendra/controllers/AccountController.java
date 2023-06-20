package com.amrendra.controllers;


import com.amrendra.model.Accounts;
import com.amrendra.repository.AccountsRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AccountController {

    private final AccountsRepository accountsRepository;

    @GetMapping("/myAccount")
    public Accounts getAccountDetails(@RequestParam int id) {
        Accounts accounts = (Accounts) accountsRepository.findByCustomerID(id);
        if (accounts != null ) {
            return accounts;
        }else {
            return null;
        }
    }


}
