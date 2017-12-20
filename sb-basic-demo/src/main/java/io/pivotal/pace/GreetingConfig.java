package io.pivotal.pace;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingConfig {

  Logger logger = LoggerFactory.getLogger(GreetingConfig.class);

  // Loads the database on startup
  @Bean
  CommandLineRunner loadDatabase(GreetingRepository gr) {
    return commandLineRunner -> {
      logger.info("loading database..");
      gr.save(new Greeting("English","Hello"));
      gr.save(new Greeting("Spanish","Hola"));
      gr.save(new Greeting("French","Bonjour"));
      logger.debug("record count: {}", gr.count());
      gr.findAll().forEach(x -> logger.debug(x.toString()));
    };
  }
}
