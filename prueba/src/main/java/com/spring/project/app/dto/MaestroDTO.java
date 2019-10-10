package com.spring.project.app.dto;

import java.util.Date;

public class MaestroDTO {
	private Integer cdSecuencia;
	private String nbMaestro;
	private String nbApPaterno;
	private String nbApMaterno;
	private Date fhNacimiento;
	private Integer nuEdad;
	private String cdMatricula;
	private Date fhAlta;
	private Date fhModificacion;
	
	public Integer getCdSecuencia() {
		return cdSecuencia;
	}
	public void setCdSecuencia(Integer cdSecuencia) {
		this.cdSecuencia = cdSecuencia;
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
	public String getCdMatricula() {
		return cdMatricula;
	}
	public void setCdMatricula(String cdMatricula) {
		this.cdMatricula = cdMatricula;
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
