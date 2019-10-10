package com.spring.project.app.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pru02_libros", schema = "prueba")
public class PRU02Libros {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer cdSecuencia;
	
	@Column		
	private Integer cdLibro;
	
	@Column
	private String nb_libro;
	
	@Column
	private String stStatus;

	public Integer getCdSecuencia() {
		return cdSecuencia;
	}

	public void setCdSecuencia(Integer cdSecuencia) {
		this.cdSecuencia = cdSecuencia;
	}

	public Integer getCdLibro() {
		return cdLibro;
	}

	public void setCdLibro(Integer cdLibro) {
		this.cdLibro = cdLibro;
	}

	public String getNb_libro() {
		return nb_libro;
	}

	public void setNb_libro(String nb_libro) {
		this.nb_libro = nb_libro;
	}

	public String getStStatus() {
		return stStatus;
	}

	public void setStStatus(String stStatus) {
		this.stStatus = stStatus;
	}
	
	
	

}
