package com.aboruo.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aboruo.order.service.ProducerServiceFeignInter;
/**
	 * @Title:  OrderController
	 * @Description:  订单处理类
	 * @author:  aboruo
	 * @date 2018年5月2日 下午6:33:41
 */
@RestController
@EnableFeignClients
public class OrderController {
	@Autowired
	private ProducerServiceFeignInter producerServiceFeignInter;
	/**
		 * @Title: hello
		 * @Description:  接口测试方法
		 * @author: aboruo
		 * @return
		 * @date 2018年5月2日 下午6:34:04
	 */
	@RequestMapping(value="/hello",method= {RequestMethod.GET,RequestMethod.POST})
	public String hello() {
		return "hello,this is order-service";
	}
	/**
		 * @Title: callProducerService
		 * @Description:  请求产品生产服务
		 * @author: aboruo
		 * @return
		 * @date 2018年5月2日 下午6:36:38
	 */
	@RequestMapping(value="/product/hello",method= {RequestMethod.GET,RequestMethod.POST})
	public String callProducerService() {
		return producerServiceFeignInter.hello();
	}
}
