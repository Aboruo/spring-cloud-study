package com.aboruo.order.service;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.aboruo.order.service.impl.ProducerServiceFeignInterHystrix;
@FeignClient(name="producer-service",fallback=ProducerServiceFeignInterHystrix.class)
public interface ProducerServiceFeignInter {
	@RequestMapping(value="/hello",method= RequestMethod.GET)
	String hello();
}