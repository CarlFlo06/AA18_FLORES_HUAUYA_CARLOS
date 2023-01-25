package com.tarea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
//@EnableConfigurationProperties
public class EjemploConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjemploConfigServerApplication.class, args);
	}

}
