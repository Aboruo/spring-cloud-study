package com.aboruo.order.service.impl;

import org.springframework.stereotype.Component;
import com.aboruo.order.service.ProducerServiceFeignInter;
@Component
public class ProducerServiceFeignInterHystrix implements ProducerServiceFeignInter {

	@Override
	public String hello() {
		return "服务休息了，明天再试吧";
	}

}
