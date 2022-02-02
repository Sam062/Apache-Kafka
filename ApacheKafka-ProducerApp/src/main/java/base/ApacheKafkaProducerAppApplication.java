package base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApacheKafkaProducerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApacheKafkaProducerAppApplication.class, args);
		System.out.println("==========>>> Application started");
	}

}
