package com.aboruo.order.channel.receiver.integration;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.binder.Binder;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.annotation.Transformer;

import com.aboruo.order.channel.IntegrationInput;
import com.aboruo.order.channel.IntegrationOutput;

@EnableBinding(value= {IntegrationInput.class,IntegrationOutput.class})
public class IntegrationReceiver {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@ServiceActivator(inputChannel=IntegrationInput.INPUT)
	public void receive(Object payload) {
		logger.info("IntegrationReceiver Received: " + payload);
	}
	@Transformer(inputChannel=IntegrationInput.INPUT,outputChannel=IntegrationOutput.OUTPUT)
	public Object transform(Date message) {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(message);
	}
}
