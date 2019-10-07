package az.pashabank.ls.msnotifier.service;

import az.pashabank.ls.msnotifier.dao.entity.CityEntity;
import az.pashabank.ls.msnotifier.dao.repository.CityRepository;
import az.pashabank.ls.msnotifier.exception.NotFoundException;
import az.pashabank.ls.msnotifier.mappers.CityMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {

    private CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public void deleteCity(String city) {
        CityEntity cityEntity= cityRepository.findByName(city)
                .orElseThrow(NotFoundException::new);

        cityRepository.delete(cityEntity);
    }

    public void addCity(String city) {
        Optional<CityEntity> cityEntity = cityRepository.findByName(city);
        if (cityEntity.isEmpty()){
            CityEntity savedCity = CityMapper.INSTANCE.mapDtoToEntity(city);
            cityRepository.save(savedCity);
        }
        else {
          //TODO LOG THAT CITY IS ALREADY IN THE LIST
        }
    }
}
