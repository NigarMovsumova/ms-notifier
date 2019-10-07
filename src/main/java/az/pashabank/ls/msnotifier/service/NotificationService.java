package az.pashabank.ls.msnotifier.service;

import az.pashabank.ls.msnotifier.client.WeatherClient;
import az.pashabank.ls.msnotifier.dao.entity.CityEntity;
import az.pashabank.ls.msnotifier.dao.entity.DailyWeatherEntity;
import az.pashabank.ls.msnotifier.dao.repository.CityRepository;
import az.pashabank.ls.msnotifier.dao.repository.DailyWeatherRepository;
import az.pashabank.ls.msnotifier.mappers.WeatherMapper;
import az.pashabank.ls.msnotifier.model.WeatherDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NotificationService {

    private final CityRepository cityRepository;
    private final WeatherClient weatherClient;
    private final DailyWeatherRepository dailyWeatherRepository;

    public NotificationService(CityRepository cityRepository,
                               DailyWeatherRepository dailyWeatherRepository,
                               WeatherClient weatherClient) {
        this.dailyWeatherRepository = dailyWeatherRepository;
        this.cityRepository = cityRepository;
        this.weatherClient = weatherClient;
    }

    public List<WeatherDto> getDailyWeather(){
        List<DailyWeatherEntity> dailyWeatherEntityList = dailyWeatherRepository.findAll();
        return WeatherMapper.INSTANCE.mapEntityListToDtoList(dailyWeatherEntityList);
    }

    public void saveDailyWeather() {
        List<String> cityEntityList = cityRepository
                .findAll()
                .stream()
                .map(CityEntity::getName)
                .collect(Collectors.toList());

        List<WeatherDto> weatherDtoList= weatherClient
                .getDailyWeatherByCities(cityEntityList);

        List<DailyWeatherEntity> dailyWeatherEntityList = WeatherMapper
                .INSTANCE
                .mapDtoListToEntityList(weatherDtoList);

        dailyWeatherRepository.deleteAll();
        dailyWeatherRepository.saveAll(dailyWeatherEntityList);
    }
}
