package com.drogueriakonex.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="registroventa")
public class registroVenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRegistroVenta;
	
	@Column(name="fechahora", length = 100, nullable = false)
	private String fechaHora;
	
	@Column(name="nombremedicamento", length = 100, nullable = false)
	private String nombreMedicamento;
	
	@Column(name="cantidad")
	private Integer cantidad;
	
	@Column(name="valorunitario")
	private Integer valorUnitario;
	
	@Column(name="valortotal")
	private Integer valorTotal;

	public Integer getIdRegistroVenta() {
		return idRegistroVenta;
	}

	public void setIdRegistroVenta(Integer idRegistroVenta) {
		this.idRegistroVenta = idRegistroVenta;
	}

	public String getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getNombreMedicamento() {
		return nombreMedicamento;
	}

	public void setNombreMedicamento(String nombreMedicamento) {
		this.nombreMedicamento = nombreMedicamento;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Integer valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Integer getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Integer valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
}
