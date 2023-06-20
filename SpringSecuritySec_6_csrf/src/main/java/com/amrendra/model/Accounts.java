package com.amrendra.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Accounts {

    @Column(name="customer_id", nullable = false)
    private  Long customerID;

    @Id
    @Column(name = "account_number", nullable = false)
    private Long accountNumber;

    @Column(name = "account_type", nullable = false)
    private String accountType;

    @Column(name = "branch_address", nullable = false)
    private String branchAddress;

    @Column(name = "create_dt")
    private String createDate;


}
