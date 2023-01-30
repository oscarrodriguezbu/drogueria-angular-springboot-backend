package com.drogueriakonex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drogueriakonex.model.Laboratorio;
import com.drogueriakonex.service.ILaboratorioService;

@RestController
@RequestMapping("/laboratorio")
public class LaboratorioController {

	@Autowired
	ILaboratorioService service;
	
	@GetMapping	
	public ResponseEntity<List<Laboratorio> > listar(){
		List<Laboratorio> obj = service.listar();
		return new ResponseEntity<List<Laboratorio> >(obj, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Laboratorio> crear(@RequestBody Laboratorio laboratorio){
		Laboratorio obj = service.crear(laboratorio);
		return new ResponseEntity<Laboratorio>(obj, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Laboratorio> actualizar(@RequestBody Laboratorio laboratorio){
		Laboratorio obj = service.actualizar(laboratorio);
		return new ResponseEntity<Laboratorio>(obj, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception{
		Laboratorio obj = service.ListarPorId(id); 
		if(obj == null) {
			throw new Exception("No se encontró el ID");
		}
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Laboratorio> listarPorId(@PathVariable("id") Integer codigo)throws Exception{
		Laboratorio obj = service.ListarPorId(codigo); 
		if(obj == null) {
			throw new Exception("No se encontró el ID");
		}
		return new ResponseEntity<Laboratorio>(obj, HttpStatus.OK);
	}
	
	
}
