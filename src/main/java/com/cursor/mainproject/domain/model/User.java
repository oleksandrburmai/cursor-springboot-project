package com.cursor.mainproject.domain.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "USERS")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;
    @Column(name = "DATE_OF_REGISTRATION")
    private Date dateOfRegistration;
    @Column(name = "ROLES")
    private String roles;
    @Column(name = "ACTIVE")
    private boolean active;

}
