package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Namespring {
			@GetMapping("/guru")
			public String getName()
			{
				String name="guru";
				return "Welcome "+name+"!";
			}
}
