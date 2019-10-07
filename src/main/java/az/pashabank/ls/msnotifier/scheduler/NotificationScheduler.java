package az.pashabank.ls.msnotifier.scheduler;

import az.pashabank.ls.msnotifier.model.WeatherDto;
import az.pashabank.ls.msnotifier.service.NotificationService;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Profile("!integration")
public class NotificationScheduler {

    private final NotificationService notificationService;

    public NotificationScheduler(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Scheduled(cron = "0/20 * * * * *")
    public void saveNewWeatherInfo() {
        notificationService.saveDailyWeather();
    }
}
