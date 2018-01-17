package com.voyant.sample.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ssharma on 1/17/18.
 */

@RestController
public class MessageController {

    Logger logger = LoggerFactory.getLogger(MessageController.class);

    @Autowired
    KafkaTemplate<Integer,String> kafkaTemplate;

    @PostMapping("/post-message/{kafkaTopic}")
    public ResponseEntity<?> sendMessage(@PathVariable(name = "kafkaTopic") String kafkaTopic,
                                         @RequestBody String payload){

        logger.info("Message : "+payload);

        kafkaTemplate.send(kafkaTopic,payload);

        return ResponseEntity.accepted().build();
    }

}
