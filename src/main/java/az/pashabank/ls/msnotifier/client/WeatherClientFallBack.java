package az.pashabank.ls.msnotifier.client;

import az.pashabank.ls.msnotifier.exception.ClientException;
import az.pashabank.ls.msnotifier.model.WeatherDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WeatherClientFallBack implements WeatherClient {

    private static final Logger logger = LoggerFactory.getLogger(WeatherClientFallBack.class);

    @Override
    public List<WeatherDto> getDailyWeatherByCities(List<String> cityList) {
        logger.error("ActionLog.getTodayWeather.error college client fallback");
        throw new ClientException();
    }
}
