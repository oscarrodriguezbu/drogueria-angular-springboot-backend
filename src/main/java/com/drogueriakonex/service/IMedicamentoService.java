package com.drogueriakonex.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.drogueriakonex.model.Medicamento;

public interface IMedicamentoService {
	
	List<Medicamento> listar ();
	Medicamento crear(Medicamento medicamento);
	Medicamento actualizar(Medicamento medicamento);
	void eliminar (Integer codigo);
	Medicamento ListarPorId(Integer codigo);
	
	Page<Medicamento> listPageable(Pageable pageable); //paginacion

}
