package com.spring.project.app.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.project.app.dto.LibroDTO;


@Component
public class LibroDAO {
	
	@Autowired
	private EntityManager em;
	
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<LibroDTO> lstLibros() throws Exception {
		List<LibroDTO> lstLibros = new ArrayList<LibroDTO>();
		
		Query query = em.createNativeQuery("SELECT \r\n" + 
				"	PRU01.cd_secuencia cdSecuencia, \r\n" + 
				"	PRU01.cd_libro cdLibro, \r\n" + 
				"	PRU01.nb_libro nbLibro, \r\n" + 
				"	PRU01.st_status stStatus \r\n" + 
				"FROM \r\n" + 
				"	prueba.pru02_libros PRU01");
//		query.setParameter("cdLibro", "");
		query.unwrap(NativeQuery.class)
		.addScalar("cdSecuencia", IntegerType.INSTANCE)
		.addScalar("cdLibro", IntegerType.INSTANCE)
		.addScalar("nbLibro", StringType.INSTANCE)
		.addScalar("stStatus", StringType.INSTANCE)
		.setResultTransformer(Transformers.aliasToBean(LibroDTO.class));
		
		lstLibros = (List<LibroDTO>) query.getResultList();
		
		return lstLibros;
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public LibroDTO getLibro(Integer cdSecuencia) throws Exception {
		List<LibroDTO> resultado = new ArrayList<LibroDTO>();
		LibroDTO libro = new LibroDTO();
		
		Query query = em.createNativeQuery("SELECT \r\n" +
				"PRU01.cd_secuencia cdSecuencia, \r\n" +
				"PRU01.cd_libro cdLibro, \r\n" +
				"PRU01.nb_libro nbLibro, \r\n" + 
				"PRU01.st_status stStatus \r\n" +
				"FROM \r\n prueba.pru02_libros PRU01\r\n"+
				"WHERE PRU01.cd_secuencia = ?");
		
		query.setParameter(1, cdSecuencia);
		query.unwrap(NativeQuery.class)
		.addScalar("cdSecuencia", IntegerType.INSTANCE)
		.addScalar("cdLibro", IntegerType.INSTANCE)
		.addScalar("nbLibro", StringType.INSTANCE)
		.addScalar("stStatus", StringType.INSTANCE)
		.setResultTransformer(Transformers.aliasToBean(LibroDTO.class));
		
		resultado = query.getResultList();
		
		if(!resultado.isEmpty()) {
			libro = resultado.get(0);
		}
		return libro;
	}
	
}

/*@Component
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
	}*/
