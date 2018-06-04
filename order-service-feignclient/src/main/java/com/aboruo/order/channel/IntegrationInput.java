package com.aboruo.order.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface IntegrationInput {
	String INPUT = "IntegrationInput";
	@Input(value=IntegrationInput.INPUT)
	SubscribableChannel input();
}
