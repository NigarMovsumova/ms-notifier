package az.pashabank.ls.msnotifier.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WeatherDto {
    private String city;

    private LocalDate date;

    private Double temperature;

    private String scale;
}
