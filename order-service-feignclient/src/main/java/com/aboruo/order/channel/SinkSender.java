package com.aboruo.order.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;

public interface SinkSender {
	@Output(value=Source.OUTPUT)
	MessageChannel	output();
}
