package com.aldv.eureka.client1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Controller
public class ClientController {
	
	@Autowired
    private RestTemplate restTemplate;
	
	@RequestMapping("/client1")
	public ResponseEntity<String> getValue() {
		ResponseEntity<String> exchange = 
				this.restTemplate.exchange("http://client2/getAll", HttpMethod.GET, null, 
				new ParameterizedTypeReference<String>() {}, (Object)"mstine");
		
		return exchange;
	}

}



