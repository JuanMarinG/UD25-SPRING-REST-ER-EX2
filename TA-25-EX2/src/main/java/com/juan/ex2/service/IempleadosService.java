package com.juan.ex2.service;

import java.util.List;
import com.juan.ex2.dto.Empleados;

public interface IempleadosService {

	//ALL
	public List <Empleados> listarEmpleados();
	
	//UPDATE
	public Empleados actualizarEmpleados (Empleados empleados);
	
	//CREATE
	public Empleados guardarEmpleados (Empleados empleados);
	
	//DELETE
	public void eliminarEmpleado (Long Id);
	
	//READ
	public Empleados empleadosPorId (Long Id);
}
