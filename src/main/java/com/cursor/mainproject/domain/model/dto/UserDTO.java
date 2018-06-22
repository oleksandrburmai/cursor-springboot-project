package com.cursor.mainproject.domain.model.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
public class UserDTO {

    @NotNull(message = "First name can not be NULL")
    @Size(min = 1, max = 30, message = "From 1 to 30 chars")
    private String firstName;
    @NotNull(message = "Last name can not be NULL")
    @Size(min = 1, max = 30, message = "From 1 to 30 chars")
    private String lastName;
    @NotNull(message = "Email can not be NULL")
    @Size(min = 1, max = 30, message = "From 1 to 30 chars")
    @Email(message = "You must put email")
    private String email;
    @NotNull(message = "Password can not be NULL")
    @Size(min = 6, max = 30, message = "From 6 to 30 chars")
    private String password;
    @NotNull(message = "Mobile number can not be NULL")
    private String mobileNumber;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfRegistration = new Date();
}
