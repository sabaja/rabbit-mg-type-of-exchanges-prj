package com.rabbitmq.direct.channel;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues = "hello")
public class DirectReceiver {

	@RabbitHandler
	public void receive(String in) {
		System.out.println(" [x] Received '" + in + "'");
	}
}
