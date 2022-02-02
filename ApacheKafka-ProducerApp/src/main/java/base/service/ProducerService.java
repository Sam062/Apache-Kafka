package base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import base.constants.KafkaConstants;

@Service("customerService")
public class ProducerService {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public String add(String msg) {
		if(msg!=null && !msg.isEmpty()) {
				kafkaTemplate.send(KafkaConstants.TOPIC, msg);
				
				System.out.println("UPDATING NEWS : "+msg + ", To TOPIC :"+KafkaConstants.TOPIC);
				System.out.println("===>>> NEWS UPDATED TO KAFKA <<<===");
		}else
			System.out.println("===>>> MSG NULL/EMPTY <<<==="+msg);
		
		return "MSG added to the queue successfully";
	}
	
}
