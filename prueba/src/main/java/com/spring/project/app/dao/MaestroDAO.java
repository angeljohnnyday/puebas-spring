package com.spring.project.app.dao;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.project.app.dominio.PRU01Maestros;
import com.spring.project.app.dto.MaestroDTO;

@Component
public class MaestroDAO {
	
	@Autowired
	private EntityManager em;
	
	@Transactional
	public void guardar(MaestroDTO maestroDTO) throws Exception {
		PRU01Maestros maestro = new PRU01Maestros();
		maestro.setNbMaestro(maestroDTO.getNbMaestro());
		maestro.setNbApPaterno(maestroDTO.getNbApPaterno());
		maestro.setNbApMaterno(maestroDTO.getNbApMaterno());
		maestro.setCdMatricula(maestroDTO.getCdMatricula());
		maestro.setFhNacimiento(maestroDTO.getFhNacimiento());
		maestro.setNuEdad(maestroDTO.getNuEdad());
		maestro.setFhAlta(new Date());
		
		em.persist(maestro);
		em.flush();
	}
	
}
