package br.com.shopnow.servicekafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;


@EnableKafka
@SpringBootApplication
public class ServiceKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceKafkaApplication.class, args);
	}

}
