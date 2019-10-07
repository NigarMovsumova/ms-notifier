package az.pashabank.ls.msnotifier.mappers;

import az.pashabank.ls.msnotifier.dao.entity.DailyWeatherEntity;
import az.pashabank.ls.msnotifier.model.WeatherDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class WeatherMapper {

    public static final WeatherMapper INSTANCE = Mappers.getMapper(WeatherMapper.class);

    @Mappings({
            @Mapping(target = "city", source = "city"),
            @Mapping(target = "date", source = "date"),
            @Mapping(target = "temperature", source = "temperature"),
            @Mapping(target = "scale", source = "scale")
    })
    public abstract DailyWeatherEntity mapDtoToEntity(WeatherDto weatherDto);


    @Mappings({
            @Mapping(target = "city", source = "city"),
            @Mapping(target = "date", source = "date"),
            @Mapping(target = "temperature", source = "temperature"),
            @Mapping(target = "scale", source = "scale"),
    })
    public abstract WeatherDto mapEntityToDto(DailyWeatherEntity dailyWeatherEntity);

    public abstract List<WeatherDto> mapEntityListToDtoList(List<DailyWeatherEntity> customerEntityList);

    public abstract List<DailyWeatherEntity> mapDtoListToEntityList(List<WeatherDto> customerDtoList);

}
