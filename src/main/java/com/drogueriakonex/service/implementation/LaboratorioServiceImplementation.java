package com.drogueriakonex.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drogueriakonex.model.Laboratorio;
import com.drogueriakonex.repository.ILaboratorioRepository;
import com.drogueriakonex.service.ILaboratorioService;

@Service
public class LaboratorioServiceImplementation implements ILaboratorioService{
	
	@Autowired
	ILaboratorioRepository repo;

	@Override
	public List<Laboratorio> listar() {		
		return repo.findAll();
	}

	@Override
	public Laboratorio crear(Laboratorio laboratorio) {		
		return repo.save(laboratorio);
	}

	@Override
	public Laboratorio actualizar(Laboratorio laboratorio) {
		return repo.save(laboratorio);
	}

	@Override
	public void eliminar(Integer codigo) {
		repo.deleteById(codigo);		
	}

	@Override
	public Laboratorio ListarPorId(Integer codigo) {
		return repo.findById(codigo).orElse(null);
	}

}
