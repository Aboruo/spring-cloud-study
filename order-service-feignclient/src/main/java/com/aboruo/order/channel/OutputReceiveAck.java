package com.aboruo.order.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
/**
	 * @Title:  OutputReceiveAck
	 * @Description:  消息生产者output的接收消费者确认消息通道
	 * @author:  aboruo
	 * @date 2018年6月4日 上午11:35:01
 */
public interface OutputReceiveAck {
	String INPUT="output-receive-ack";
	@Input(value = OutputReceiveAck.INPUT)
	SubscribableChannel input();
}
