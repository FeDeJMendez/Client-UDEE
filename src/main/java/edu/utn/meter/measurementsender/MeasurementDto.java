package edu.utn.meter.measurementsender;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MeasurementDto {
    String serialNumber;
    Double value;
    String date;
    String password;
}
