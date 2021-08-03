package com.br.port.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerTest {
	
	@GetMapping("/home")
	public String home() {
		return "Home";
	}
}
