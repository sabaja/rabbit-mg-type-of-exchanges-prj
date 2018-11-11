package com.rabbitmq.direct.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rabbitmq.direct.channel.DirectReceiver;
import com.rabbitmq.direct.channel.DirectSender;


@Profile({"direct","hello-world"})
@Configuration
public class DirectConfig {
	
	@Bean
	public Queue hello() {
		return new Queue("hello");
	}

	@Bean
	public DirectReceiver receiver() {
		return new DirectReceiver();
	}
	

	@Bean
	public DirectSender sender() {
		return new DirectSender();
	}

}
