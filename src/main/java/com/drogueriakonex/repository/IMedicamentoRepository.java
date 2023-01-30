package com.drogueriakonex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drogueriakonex.model.Medicamento;

public interface IMedicamentoRepository extends JpaRepository<Medicamento, Integer> {

	
}
