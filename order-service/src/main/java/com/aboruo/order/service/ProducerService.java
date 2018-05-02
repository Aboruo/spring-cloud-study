package com.aboruo.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
/**
	 * @Title:  ProducerService
	 * @Description:  class description
	 * @author:  aboruo
	 * @date 2018年5月2日 下午6:30:25
 */
@Service
public class ProducerService {
	@Autowired
	private RestTemplate restTemplate;
	/**
		 * @Title: callProducerService
		 * @Description:  调用第三方接口服务，需要加熔断机制
		 * @author: aboruo
		 * @return
		 * @date 2018年5月2日 下午6:26:56
	 */
	@HystrixCommand(fallbackMethod="producerServiceFallback")
	public String callProducerService() {
		return restTemplate.getForEntity("http://PRODUCER-SERVICE/hello", String.class).getBody();
	}
	/**
		 * @Title: producerServiceFallback
		 * @Description:  熔断发生时，熔断需要调用的fallback方法
		 * @author: aboruo
		 * @return String
		 * @date 2018年5月2日 下午6:30:40
	 */
	public String producerServiceFallback() {
		return "生产人员已休息，请明日再来";
	}
}
