package com.sunflower.forun.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/hello")
public class HelloResource {

	@GetMapping
	public ResponseEntity<String> message(){
		String msg = "hello word";
		return ResponseEntity.ok().body(msg);
	}
	
}
