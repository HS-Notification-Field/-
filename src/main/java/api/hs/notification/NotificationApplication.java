package api.hs.notification;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.TimeZone;

@SpringBootApplication
@EnableJpaAuditing
public class NotificationApplication {

  public static void main(String[] args) {
    SpringApplication.run(NotificationApplication.class, args);
  }

  @Bean
  public CommandLineRunner init() {
    return args -> {
      TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
    };
  }
}
