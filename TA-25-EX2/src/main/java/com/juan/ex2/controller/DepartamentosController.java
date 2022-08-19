package com.juan.ex2.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juan.ex2.dto.Departamentos;
import com.juan.ex2.service.DepartamentosServiceImpl;

@RestController
@RequestMapping("/api")
public class DepartamentosController {

	@Autowired
	DepartamentosServiceImpl departamentosServiceImpl;

	@GetMapping("/departamentos")
	public List<Departamentos> listarDepartamentos() {
		return departamentosServiceImpl.listarDepartamentos();
	}

	@PostMapping("/departamentos")
	public Departamentos guardarDepartamentos(@RequestBody Departamentos departamentos) {
		return departamentosServiceImpl.guardarDepartamentos(departamentos);
	}

	@GetMapping ("/departamentos/{Id}")
	public Departamentos departamentosPorId(@PathVariable(name="Id")Long Id) {
		Departamentos departamentos_porid = new Departamentos();
		departamentos_porid = departamentosServiceImpl.departamentosPorId(Id);
		return departamentos_porid;
		
	}

	@PutMapping("/departamentos/{id}")
	public Departamentos actualizarDepartamento
	(@PathVariable(name="Id")Long Id, @RequestBody Departamentos departamentos) {
	
	Departamentos departamento_seleccionado = new Departamentos();
	Departamentos departamento_actualizado = new Departamentos ();
	
	departamento_seleccionado= departamentosServiceImpl.departamentosPorId(Id);
	departamento_seleccionado.setNombre(departamentos.getNombre());
	departamento_actualizado = departamentosServiceImpl.actualizarDepartamento(departamento_seleccionado);
	
	return departamento_actualizado;
	
	}

}
