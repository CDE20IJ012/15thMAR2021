package com.demo.cts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springbootloggerwithslf4jApplication {
private static final Logger LOGGER=LoggerFactory.getLogger(Springbootloggerwithslf4jApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(Springbootloggerwithslf4jApplication.class, args);
	     LOGGER.info("Logged from my application");
	     LOGGER.debug("This is the debug message");
	     LOGGER.warn("This is the warn message");
	     LOGGER.error("This is the error message");
	}

}
