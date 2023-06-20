package com.amrendra.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;


    @Column(name = "mobile_number", nullable = false)
    private String mobileNumber;

    @Column(nullable = false)
   // @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String pwd;

    @Column(nullable = false)
    private String role;

    @Column(name = "create_dt")
    private String createDt;
}
