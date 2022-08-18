package com.juan.ex2.service;

import java.util.List;
import com.juan.ex2.dto.Departamentos;

public interface IdepartamentosService {
	
	//ALL
	public List<Departamentos> listarDepartamentos(); 
	
	//UPDATE
	public Departamentos actualizarDepartamento(Departamentos departamentos);
	
	//CREATE
	public Departamentos guardarDepartamentos (Departamentos departamentos);
	
	//DELETE
	public Departamentos eliminarDepartamento (Long Id);
	
	//READ
	public Departamentos departamentosPorId (Long Id);
}
