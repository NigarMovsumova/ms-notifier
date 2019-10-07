package az.pashabank.ls.msnotifier.dao.repository;

import az.pashabank.ls.msnotifier.dao.entity.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CityRepository extends JpaRepository<CityEntity, Long>{

    Optional<CityEntity> findByName(String name);
}
