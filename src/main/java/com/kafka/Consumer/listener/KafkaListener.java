package com.kafka.Consumer.listener;


import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class KafkaListener {
	
	@org.springframework.kafka.annotation.KafkaListener(topics = "${kafka.topic}")
	public void listener(Message<String> message) {
		
		System.out.println(message.getPayload());
	}
}
