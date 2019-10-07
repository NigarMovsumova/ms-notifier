package az.pashabank.ls.msnotifier.mappers;

import az.pashabank.ls.msnotifier.dao.entity.CityEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class CityMapper {

    public static final CityMapper INSTANCE = Mappers.getMapper(CityMapper.class);

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "name", source = "city"),
    })
    public abstract CityEntity mapDtoToEntity(String city);

    public abstract List<CityEntity> mapDtoListToEntityList(List<String> cityList);

}
