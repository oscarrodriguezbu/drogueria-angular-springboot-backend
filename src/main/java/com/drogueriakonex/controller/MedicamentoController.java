package com.drogueriakonex.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.drogueriakonex.model.Medicamento;
import com.drogueriakonex.service.IMedicamentoService;

@RestController
@RequestMapping("/medicamentos")
public class MedicamentoController {

	@Autowired
	private IMedicamentoService service;
		
	@GetMapping	
	public ResponseEntity<List<Medicamento> > listar(){
		List<Medicamento> obj = service.listar();
		return new ResponseEntity<List<Medicamento> >(obj, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Void> crear(@RequestBody Medicamento medicamento){
		
		Medicamento obj = service.crear(medicamento);		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdMedicamento()).toUri();		
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping
	public ResponseEntity<Medicamento> actualizar(@RequestBody Medicamento medicamento){
		Medicamento obj = service.actualizar(medicamento);
		return new ResponseEntity<Medicamento>(obj, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception{
		Medicamento obj = service.ListarPorId(id); 
		if(obj == null) {
			throw new Exception("No se encontró el ID");
		}
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Medicamento> listarPorId(@PathVariable("id") Integer codigo)throws Exception{
		Medicamento obj = service.ListarPorId(codigo); 
		if(obj == null) {
			throw new Exception("No se encontró el ID");
		}
		return new ResponseEntity<Medicamento>(obj, HttpStatus.OK);
	}
	
	@GetMapping("/pageable") //cantidad de registros que se necesiten para paginacion
	public ResponseEntity<Page<Medicamento>> listPageable(Pageable pageable) throws Exception {
		Page<Medicamento> medicamento = service.listPageable(pageable);
		return new ResponseEntity<Page<Medicamento>>(medicamento, HttpStatus.OK);
	}
}
 