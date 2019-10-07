package az.pashabank.ls.msnotifier.client;

import az.pashabank.ls.msnotifier.model.WeatherDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Component
@FeignClient(name = "weather", url = "${client.ms-weather-info.url}")
public interface WeatherClient {

    @PostMapping("/cities")
    List<WeatherDto> getDailyWeatherByCities(@RequestBody List<String> cityList);
}
