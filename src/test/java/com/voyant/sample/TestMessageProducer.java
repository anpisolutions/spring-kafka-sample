package com.voyant.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ssharma on 1/17/18.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestMessageProducer {

    @Autowired
    KafkaTemplate<Integer,String> kafkaTemplate;

    @Test
    public void sendMessageTest(){

        kafkaTemplate.send("test-topic","Hi Satyendra");
    }
}
