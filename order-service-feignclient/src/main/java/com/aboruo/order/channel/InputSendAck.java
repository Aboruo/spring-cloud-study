package com.aboruo.order.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
/**
	 * @Title:  InputSendAck
	 * @Description:  input通道消费者  向 生产者 发送确认消息 时所用通道
	 *  实际上是 生产者的监听接收通道
	 * @author:  aboruo
	 * @date 2018年6月4日 上午11:36:18
 */
public interface InputSendAck {
	String OUTPUT = "input-send-ack";
	@Output(value=InputSendAck.OUTPUT)
	MessageChannel output();
}
