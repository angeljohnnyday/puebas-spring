package com.spring.project.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/maestro")
public class MaestroController {
	
	@GetMapping("/agregar")
	public String agregar() {
		return "agregar";
	}
	
}
