package com.amrendra.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity
@Table(name = "contact_messages")
@Getter
@Setter
public class Contact {

    @Id
    @Column(name = "contact_id", nullable = false)
    private String contactId;

    @Column(name = "contact_name", nullable = false)
    private String contactName;

    @Column(name = "contact_email", nullable = false)
    private String contactEmail;

    @Column(nullable = false)
    private String subject;

    @Column(nullable = false)
    private String message;

    @Column(name = "create_dt")
    private Date createDt;

}
