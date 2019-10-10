package com.spring.project.app.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.project.app.dao.LibroDAO;

@RestController
@RequestMapping("/LibrosRest")
public class LibrosRest {
	
	@Autowired
	private LibroDAO libroDAO;
	
	@GetMapping("/lstLibros")
	public ResponseEntity<Object> lstLibros(){
		ResponseEntity<Object> response = null;
		try {
			response = new ResponseEntity<Object>(libroDAO.lstLibros(), HttpStatus.OK );
		}catch(Exception e) {
			response = new ResponseEntity<Object>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return response;
	}
	
	@GetMapping("/getLibro/{cdSecuencia}")
	public ResponseEntity<Object> getLibro(@PathVariable("cdSecuencia") Integer cdSecuencia){
		ResponseEntity<Object> response = null;
		try {
			response = new ResponseEntity<Object>(libroDAO.getLibro(cdSecuencia), HttpStatus.OK );
		}catch(Exception e) {
			response = new ResponseEntity<Object>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return response;
	}
}
/*	@Autowired
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
	}*/