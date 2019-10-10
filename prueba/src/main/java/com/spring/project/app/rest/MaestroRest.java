package com.spring.project.app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.project.app.dao.MaestroDAO;
import com.spring.project.app.dto.MaestroDTO;

@RestController
@RequestMapping("/MaestroRest")
public class MaestroRest {
	
	@Autowired
	private MaestroDAO maestroDAO;
	
	@PostMapping("/guardar")
	public ResponseEntity<Object> guardar(@RequestBody MaestroDTO maestroDTO){
		ResponseEntity<Object> response = null;
		try {
			maestroDAO.guardar(maestroDTO);
			response = new ResponseEntity<Object>(HttpStatus.OK);
		} catch (Exception e) {
			response = new ResponseEntity<Object>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return response;
	}

}