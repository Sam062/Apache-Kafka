package base.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import base.constants.KafkaConstants;

@Service
public class SubscriberService {

	@KafkaListener(topics = KafkaConstants.TOPIC)
	public void listner(String c) {
		System.out.println("***********--- LISTNER CALLED ---***********");
		System.out.println("=====>>> NEWS UPDATE BY GOOGLE NEWS APP :: "+c);
	}

}
