package com.voyant.sample.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Created by ssharma on 1/17/18.
 */

@Component
public class MessageListener {

    Logger logger = LoggerFactory.getLogger(MessageListener.class);

    @KafkaListener(id = "${spring.application.name}",topics = "test-topic")
    public void listenMessage(String message){

        logger.info("Message received from Kafka topic : "+message);
    }
}
