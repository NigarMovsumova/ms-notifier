package az.pashabank.ls.msnotifier.dao.repository;

import az.pashabank.ls.msnotifier.dao.entity.DailyWeatherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyWeatherRepository extends JpaRepository<DailyWeatherEntity, Long> {
}
