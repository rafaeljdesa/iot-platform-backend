package br.com.iotplatform.eventproducerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EventProducerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventProducerServiceApplication.class, args);
	}

}
