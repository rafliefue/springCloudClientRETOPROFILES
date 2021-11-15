package com.everis.bootcamp.client.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Value("${spring.profiles.active}")
	private String activeProfile;
	
	@Value("${some.value}")
	private String myValue;
	
	@GetMapping(path="/myValue")
	public String myValue() {
		return this.myValue + " y perfil: " + this.activeProfile;
	}
	
	@GetMapping(path="/perfil")
	public String perfil() {
		return "Perfil: " + this.activeProfile;
	}
	
	

}
