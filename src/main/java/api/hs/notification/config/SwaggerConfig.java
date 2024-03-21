package api.hs.notification.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * please explain class!
 *
 * @author :Uheejoon
 * @package :api.board.board.config
 * @fileName :SwaggerConfig
 * @since :2024-03-18 오후 5:29
 */
@Configuration
@OpenAPIDefinition(
  info = @Info(title = "Description Of My Restful service Api",
    description = "Spring Boot로 개발하는 RESTFul API 명세서 입니다.",
    version = "v1.0.0"
  )
)
public class SwaggerConfig {
  @Bean
  public GroupedOpenApi customTestOpenAPI() {
    String[] paths = {"/**"};

    return GroupedOpenApi
      .builder()
      .group("모든 API")
      .pathsToMatch(paths).build();
  }
}
