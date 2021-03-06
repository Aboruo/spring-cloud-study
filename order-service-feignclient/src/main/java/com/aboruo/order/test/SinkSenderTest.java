package com.aboruo.order.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import com.aboruo.OrderServiceFeighClientApplication;
import com.aboruo.order.channel.SinkSender;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= {OrderServiceFeighClientApplication.class})
@WebAppConfiguration
public class SinkSenderTest {
	@Autowired
	private SinkSender sinkSender;
	@Test
	public void testSender() {
		sinkSender.output().send(MessageBuilder.withPayload("This msg is from SinkSender service").build());
	}
}
