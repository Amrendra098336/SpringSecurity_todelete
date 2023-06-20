package com.amrendra.model;

import java.sql.Date;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="loans")
@Getter
@Setter
public class Loans {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    @Column(name = "loan_number")
    private int loanNumber;

    @Column(name = "customer_id", nullable = false)
    private int customerId;

    @Column(name="start_dt", nullable = false)
    private Date startDt;

    @Column(name = "loan_type", nullable = false, length = 100)
    private String loanType;

    @Column(name = "total_loan", nullable = false)
    private int totalLoan;

    @Column(name = "amount_paid", nullable = false)
    private int amountPaid;

    @Column(name = "outstanding_amount", nullable = false)
    private int outstandingAmount;

    @Column(name = "create_dt")
    private String createDt;



}