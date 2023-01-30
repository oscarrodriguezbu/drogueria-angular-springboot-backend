package com.drogueriakonex.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="medicamento")
public class Medicamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMedicamento;
	
	@Column(name="nombres", length = 100, nullable = false)
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="idLaboratorio")
	private Laboratorio laboratorio;
	
	@Column(name="fechasfabricacion", length = 100, nullable = false)
	private String fechaFabricacion;
	
	@Column(name="fechasvencimiento", length = 100, nullable = false)
	private String fechaVencimiento;
	
	@Column(name="cantidadstock")
	private Integer cantidadStock;
	
	@Column(name="valorunitario")
	private Integer valorUnitario;

	public Integer getIdMedicamento() {
		return idMedicamento;
	}

	public void setIdMedicamento(Integer idMedicamento) {
		this.idMedicamento = idMedicamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Laboratorio getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}

	public String getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(String fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Integer getCantidadStock() {
		return cantidadStock;
	}

	public void setCantidadStock(Integer cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	public Integer getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Integer valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	
}
