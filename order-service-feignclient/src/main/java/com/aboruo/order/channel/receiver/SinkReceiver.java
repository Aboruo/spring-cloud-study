package com.aboruo.order.channel.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import com.aboruo.order.channel.SinkSender;

@EnableBinding(value= {Sink.class,SinkSender.class})
public class SinkReceiver {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@StreamListener(value=Sink.INPUT)
	public void receive(Object payload) {
		logger.info("Received: " + payload);
	}
}
