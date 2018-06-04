package com.aboruo.order.channel.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.handler.annotation.SendTo;

import com.aboruo.order.channel.InputSendAck;
import com.aboruo.order.channel.SinkSender;

@EnableBinding(value= {Sink.class,SinkSender.class,InputSendAck.class})
public class SinkReceiver {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@StreamListener(value=Sink.INPUT)
	@SendTo(value=InputSendAck.OUTPUT)
	public Object receive(Object payload) {
		logger.info("Received: " + payload);
		return "SinkReceiver received SinkSender's message";
	}
}
