package az.pashabank.ls.msnotifier.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "weather_today")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DailyWeatherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city_name")
    private String city;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "temperature")
    private Double temperature;

    @Column(name = "scale")
    private String scale;
}
