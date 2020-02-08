package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@Scheduled(fixedRate = 10000)
	@RequestMapping("/")
	public String index() {
		System.out.println("Request Called");
		return "Greetings from Spring Boot!";
	}

}
