package com.drogueriakonex.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.drogueriakonex.model.Medicamento;
import com.drogueriakonex.repository.IMedicamentoRepository;
import com.drogueriakonex.service.IMedicamentoService;

@Service
public class MedicamentoServiceImplemetantion implements IMedicamentoService{
	
	@Autowired
	IMedicamentoRepository repo;

	@Override
	public List<Medicamento> listar() {
		return repo.findAll();
	}

	@Override
	public Medicamento crear(Medicamento medicamento) {		
		return repo.save(medicamento);
	}

	@Override
	public Medicamento actualizar(Medicamento medicamento) {		
		return repo.save(medicamento);
	}

	@Override
	public void eliminar(Integer codigo) {
		repo.deleteById(codigo);		
	}

	@Override
	public Medicamento ListarPorId(Integer codigo) {
		return repo.findById(codigo).orElse(null);
	}

	@Override
	public Page<Medicamento> listPageable(Pageable pageable) {		//Pagination
		return repo.findAll(pageable);
	}

}
