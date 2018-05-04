package com.aboruo.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
	@RequestMapping(value="/hello",method= RequestMethod.GET)
	public String hello() {
		return "hello,this is producer-service";
	}
}
