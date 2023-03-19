package br.com.app.greetingconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class GreetingConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingConfigServiceApplication.class, args);
	}

}
