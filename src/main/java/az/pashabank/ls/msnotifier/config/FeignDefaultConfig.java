package az.pashabank.ls.msnotifier.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "az.pashabank.ls.msnotifier.client")
public class FeignDefaultConfig {
}
