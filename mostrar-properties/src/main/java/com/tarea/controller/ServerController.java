package com.tarea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tarea.pais.paisProperties;

@RestController
@RefreshScope
public class ServerController {
	
	@Value("${label.country}")
	private String paisC;
	
	@Value("${label.country}")
	private String paisU;
	
	@Value("${label.country}")
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
