package com.aboruo.order.config;

import javax.inject.Named;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;

@Configuration
@PropertySource(value="classpath:bootstrap.yml")
@Order(value=2)
@Named
public class BootStrap {
	private String configParam;

	public String getConfigParam() {
		return configParam;
	}

	public void setConfigParam(String configParam) {
		this.configParam = configParam;
	}
}
