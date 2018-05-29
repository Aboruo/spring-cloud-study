package com.aboruo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.PropertySource;
@EnableDiscoveryClient
@PropertySource(value="classpath:config/application.yml")
@SpringBootApplication
public class RabbitHelloApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(RabbitHelloApplication.class).web(true).run(args);
	}

}
