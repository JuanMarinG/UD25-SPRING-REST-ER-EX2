package com.juan.ex2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juan.ex2.dto.Empleados;
import com.juan.ex2.service.EmpleadosServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadosController {

	@Autowired 
	EmpleadosServiceImpl empleadosServiceImpl;
	
	@GetMapping("/empleados")
	public List<Empleados> listarEmpleados(){
		return empleadosServiceImpl.listarEmpleados();
	}
	
	@PostMapping("/empleados")
	public Empleados guardarEmpleados (@RequestBody Empleados empleados) {
		return empleadosServiceImpl.guardarEmpleados(empleados);
	}
	
	
	@GetMapping ("/empleados/{Id}")
	public Empleados empleadosPorId(@PathVariable(name="Id")Long Id) {
		Empleados empleados_porid = new Empleados();
		empleados_porid = empleadosServiceImpl.empleadosPorId(Id);
		return empleados_porid;
		
	}
	
	@PutMapping ("/empleados/{Id}")
	public Empleados actualizarEmpleado
	(@PathVariable(name="Id")Long Id, @RequestBody Empleados empleados) {
		
		Empleados empleado_seleccionado = new Empleados();
		Empleados empleado_actualizado = new Empleados();
		
		empleado_seleccionado = empleadosServiceImpl.empleadosPorId(Id);
		empleado_seleccionado.setNombre(empleados.getNombre());
		empleado_actualizado = empleadosServiceImpl.actualizarEmpleados(empleado_seleccionado);
		
		return empleado_actualizado;
	}
	
	
	
	
}
