package com.drogueriakonex.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="laboratorio")
public class Laboratorio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idLaboratorio;
	
	@Column(name="nombres", length = 100, nullable = false)
	private String nombre;

	public Integer getIdLaboratorio() {
		return idLaboratorio;
	}

	public void setIdLaboratorio(Integer idLaboratorio) {
		this.idLaboratorio = idLaboratorio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
