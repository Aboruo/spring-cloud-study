package com.aboruo.loadBalance.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class LoadBalanceController {
	@Autowired
	private RestTemplate restTemplate;
	private Logger logger = LoggerFactory.getLogger(getClass());
	@RequestMapping(value="/producer/hello",method= {RequestMethod.GET,RequestMethod.POST})
	public String producerHello() {
		logger.info("loadbalance calling producer-service");
		return restTemplate.getForEntity("http://PRODUCER-SERVICE/hello", String.class).getBody();
	}
	@RequestMapping(value="/order/hello",method= {RequestMethod.GET,RequestMethod.POST})
	public String orderHello() {
		logger.info("loadbalance calling order-service");
		return restTemplate.getForEntity("http://ORDER-SERVICE/hello", String.class).getBody();
	}
}
