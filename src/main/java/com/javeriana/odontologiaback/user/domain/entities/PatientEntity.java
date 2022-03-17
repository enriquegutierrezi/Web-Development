package com.javeriana.odontologiaback.user.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientEntity extends UserEntity {
    private String phoneNumber;
    private double balance;
    private String address;
}
