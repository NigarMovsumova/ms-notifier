package az.pashabank.ls.msnotifier.controller;

import az.pashabank.ls.msnotifier.model.WeatherDto;
import az.pashabank.ls.msnotifier.service.NotificationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "/daily-weather")
public class DailyWeatherController {

    private final NotificationService notificationService;

    public DailyWeatherController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping
    public List<WeatherDto> getDailyWeather(){
        return notificationService.getDailyWeather();
    }
}
