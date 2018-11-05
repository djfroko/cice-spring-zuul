package com.cice.cicespringzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@EnableEurekaServer
@EnableZuulServer
@SpringBootApplication
public class CiceSpringZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiceSpringZuulApiGatewayApplication.class, args);
	}
}
