package com.javeriana.odontologiaback.user.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private long id;
    private String name;
    private String lastName;
    private LocalDate dateOfBirth;
    private String mail;
    private String password;
}
