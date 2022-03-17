package com.javeriana.odontologiaback.shared.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleSpace {
    private String day;
    private String startHour;
    private String endHour;
}
