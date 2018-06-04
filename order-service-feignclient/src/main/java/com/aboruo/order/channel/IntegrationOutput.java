package com.aboruo.order.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface IntegrationOutput {
	String OUTPUT = "Integrationoutput";
	@Output(value=IntegrationOutput.OUTPUT)
	MessageChannel output();
}
