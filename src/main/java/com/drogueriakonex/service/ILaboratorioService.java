package com.drogueriakonex.service;

import java.util.List;

import com.drogueriakonex.model.Laboratorio;


public interface ILaboratorioService {
	List<Laboratorio> listar ();
	Laboratorio crear(Laboratorio laboratorio);
	Laboratorio actualizar(Laboratorio laboratorio);
	void eliminar (Integer codigo);
	Laboratorio ListarPorId(Integer codigo);

}
