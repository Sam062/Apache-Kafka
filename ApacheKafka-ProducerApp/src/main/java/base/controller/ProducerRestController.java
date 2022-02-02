package base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import base.service.ProducerService;

@RestController
public class ProducerRestController {

	@Autowired
	private ProducerService custService;

	@GetMapping("/publish")
	public String addCustomer(@RequestParam("msg") String msg) {
		return custService.add(msg);
	}
}
