package com.example.microservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
//@PropertySource("classpath:application.yml")
public class MicroservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioApplication.class, args);
	}

}
