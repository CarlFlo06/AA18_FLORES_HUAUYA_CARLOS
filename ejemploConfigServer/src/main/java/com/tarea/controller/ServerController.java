package com.tarea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tarea.pais.paisProperties;

@RestController
public class ServerController {
	
	@Value("${label.country.chile}")
	private String paisC;
	
	@Value("${label.country.uruguay}")
	private String paisU;
	
	@Value("${label.country.peru}")
	private String paisP;
	//@Autowired
	//private paisProperties pais;
	
	@GetMapping("/chile")
	public String chile() {
		return paisC;
	}
	
	@GetMapping("/uruguay")
	public String uruguay() {
		return paisU;
	}
	
	@GetMapping("/peru")
	public String peru() {
		return paisP;
	}

}
