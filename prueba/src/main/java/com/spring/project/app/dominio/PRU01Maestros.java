package com.spring.project.app.dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRU01_MAESTROS", schema = "prueba")
public class PRU01Maestros implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CD_SECUENCIA")
	private Integer cdSecuencia;
	
	@Column(name = "CD_MATRICULA")
	private String cdMatricula;

	@Column(name = "NB_MAESTRO")
	private String nbMaestro;
	
	@Column(name = "NB_AP_PATERNO")
	private String nbApPaterno;
	
	@Column(name = "NB_AP_MATERNO")
	private String nbApMaterno;
	
	@Column(name = "FH_NACIMIENTO")
	private Date fhNacimiento;
	
	@Column(name = "NU_EDAD")
	private Integer nuEdad;
	
	@Column(name = "FH_ALTA")
	private Date fhAlta;
	
	@Column(name = "FH_MODIFICACION")
	private Date fhModificacion;

	public Integer getCdSecuencia() {
		return cdSecuencia;
	}

	public void setCdSecuencia(Integer cdSecuencia) {
		this.cdSecuencia = cdSecuencia;
	}

	public String getCdMatricula() {
		return cdMatricula;
	}

	public void setCdMatricula(String cdMatricula) {
		this.cdMatricula = cdMatricula;
	}

	public String getNbMaestro() {
		return nbMaestro;
	}

	public void setNbMaestro(String nbMaestro) {
		this.nbMaestro = nbMaestro;
	}

	public String getNbApPaterno() {
		return nbApPaterno;
	}

	public void setNbApPaterno(String nbApPaterno) {
		this.nbApPaterno = nbApPaterno;
	}

	public String getNbApMaterno() {
		return nbApMaterno;
	}

	public void setNbApMaterno(String nbApMaterno) {
		this.nbApMaterno = nbApMaterno;
	}

	public Date getFhNacimiento() {
		return fhNacimiento;
	}

	public void setFhNacimiento(Date fhNacimiento) {
		this.fhNacimiento = fhNacimiento;
	}

	public Integer getNuEdad() {
		return nuEdad;
	}

	public void setNuEdad(Integer nuEdad) {
		this.nuEdad = nuEdad;
	}

	public Date getFhAlta() {
		return fhAlta;
	}

	public void setFhAlta(Date fhAlta) {
		this.fhAlta = fhAlta;
	}

	public Date getFhModificacion() {
		return fhModificacion;
	}

	public void setFhModificacion(Date fhModificacion) {
		this.fhModificacion = fhModificacion;
	}
}
