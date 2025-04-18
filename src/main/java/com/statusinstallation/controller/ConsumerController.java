package com.statusinstallation.controller;

import java.util.List;
 
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.statusinstallation.entity.ConsumerEntity;
import com.statusinstallation.service.ConsumerService;

@RestController
@RequestMapping("api/consumer")
@CrossOrigin(origins = "*")
public class ConsumerController {
	@Autowired
	ConsumerService service;
	
	@PostMapping
	public ConsumerEntity saveData(@RequestBody ConsumerEntity C) {
		return service.saveData(C );
		
	}
	
	@GetMapping
	public List<ConsumerEntity> getData() {
		return service.getData();
		
	}
	
	@GetMapping("/test")
	public String test() {
		return "testing api";
	}
}
