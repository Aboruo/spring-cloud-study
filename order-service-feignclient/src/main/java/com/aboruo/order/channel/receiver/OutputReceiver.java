package com.aboruo.order.channel.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import com.aboruo.order.channel.OutputReceiveAck;

@EnableBinding(value= {OutputReceiveAck.class})
public class OutputReceiver {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@StreamListener(value=OutputReceiveAck.INPUT)
	public void receiveInputConfirm(Object payload) {
		logger.info("output producer received the input's confirm message====>{}",payload );
	}
}
