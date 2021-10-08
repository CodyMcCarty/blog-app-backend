package com.example.backend.blog;

import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BlogConfig {

  @Bean
  CommandLineRunner commandLineRunner(BlogRepository repository) {
    return args -> {
      Blog test = new Blog(
          "Anon",
          "Testing",
          "Test post"
      );

      Blog applicationProperties = new Blog(
          "Cody",
          "application.properties",
          "spring.datasource.url=jdbc:postgresql://localhost:5432/blog\n"
              + "spring.datasource.username=postgres\n"
              + "spring.datasource.password=root\n"
              + "spring.jpa.show-sql=true\n"
              + "\n"
              + "server.error.include-message=always\n"
              + "\n"
              + "## Hibernate Properties\n"
              + "# The SQL dialect makes Hibernate generate better SQL for the chosen database\n"
              + "spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect\n"
              + "\n"
              + "# Hibernate ddl auto (create, create-drop, validate, update)\n"
              + "spring.jpa.hibernate.ddl-auto = create-drop\n"
      );

      repository.saveAll(
          List.of(test, applicationProperties)
      );
    };
  }
}
