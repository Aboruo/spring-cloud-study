package com.aboruo.order.sender;

import java.util.Date;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.GenericMessage;

import com.aboruo.order.channel.IntegrationOutput;

@EnableBinding(value= {IntegrationOutput.class})
public class IntegrationSender {
	@Bean
	@InboundChannelAdapter(value=IntegrationOutput.OUTPUT,poller = @Poller(fixedDelay = "${fixdelay}"))
	public MessageSource<Date> timerMessageSource(){
		return () -> new GenericMessage<>(new Date());
	}
}
