package base.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscriberController {
	
	@GetMapping("/test")
	public @ResponseBody String subscriberTest() {
		return "SUBSCRIBER APP IS UP & RUNNING...";
	}

}
