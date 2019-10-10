package com.spring.project.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/libro")
public class LibroController {

	@GetMapping("/lista")
	public String lista(){
		return "libro-lista";
	}
}