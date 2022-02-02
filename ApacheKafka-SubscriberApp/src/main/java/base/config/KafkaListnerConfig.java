//package base.config;
//
//import java.util.HashMap;
//
//import org.apache.kafka.clients.consumer.ConsumerConfig;
//import org.apache.kafka.common.serialization.StringDeserializer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
//import org.springframework.kafka.core.ConsumerFactory;
//import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
//import org.springframework.kafka.support.serializer.JsonDeserializer;
//
//import base.constants.KafkaConstants;
//import base.model.CustomerModel;
//
//@Configuration
//public class KafkaListnerConfig {  USING YML CONFIG
//
//	@Bean
//	public ConsumerFactory<String, CustomerModel> consumerFactory(){
//		HashMap<String, Object> props = new HashMap<>();
//
//		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, KafkaConstants.HOST);
//		props.put(ConsumerConfig.GROUP_ID_CONFIG, KafkaConstants.GROUP_ID);
//		props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//		props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
//
//		return new DefaultKafkaConsumerFactory<>(props, new StringDeserializer(), new JsonDeserializer<>());
//	}
//
//	@Bean
//	public ConcurrentKafkaListenerContainerFactory<String, CustomerModel> kafkaListnerContainerFactory(){
//		ConcurrentKafkaListenerContainerFactory<String, CustomerModel> factory = new ConcurrentKafkaListenerContainerFactory<>();
//		factory.setConsumerFactory(consumerFactory());
//
//		return factory;
//	}
//
//}
