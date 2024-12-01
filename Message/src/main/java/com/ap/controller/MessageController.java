package com.ap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	@GetMapping(value = "/")
	public String message() {
		
		return "<h1><b><u> Hello Amit </u></b></h1>";
		
	}

}
