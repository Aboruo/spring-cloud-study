package com.aboruo.loadBalance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class LoadBalanceController {
	@Autowired
	private RestTemplate restTemplate;
	@RequestMapping(value="/producer/hello",method= {RequestMethod.GET,RequestMethod.POST})
	public String producerHello() {
		return restTemplate.getForEntity("http://PRODUCER-SERVICE/hello", String.class).getBody();
	}
	@RequestMapping(value="/order/hello",method= {RequestMethod.GET,RequestMethod.POST})
	public String orderHello() {
		return restTemplate.getForEntity("http://ORDER-SERVICE/hello", String.class).getBody();
	}
}
