package com.javeriana.odontologiaback.user.domain;

import com.javeriana.odontologiaback.shared.domain.ScheduleSpace;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dentist extends User {
    private List<ScheduleSpace> availability;
}
