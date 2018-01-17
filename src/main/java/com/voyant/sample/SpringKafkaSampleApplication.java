package com.voyant.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

/**
 * Created by ssharma on 1/17/18.
 */
@EnableKafka
@SpringBootApplication
public class SpringKafkaSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaSampleApplication.class, args);
	}
}
