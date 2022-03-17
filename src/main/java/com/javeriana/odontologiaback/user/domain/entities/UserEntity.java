package com.javeriana.odontologiaback.user.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "Users")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserEntity {
    @Id
    private Long id;

    private String name;
    private String lastName;
    private LocalDate dateOfBirth;
    private String mail;
    private String password;
}
