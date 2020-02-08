package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
	
	private int counter = -1;

	@RequestMapping("/")
	public String index(String input) {
		System.out.println("Request Called" + input);
		return "Greetings from Spring Boot!";
	}

	@Scheduled(fixedRate = 5000)
	public String mockIndex() {
		counter++;
		return index(" mocking " + counter);
	}

}
