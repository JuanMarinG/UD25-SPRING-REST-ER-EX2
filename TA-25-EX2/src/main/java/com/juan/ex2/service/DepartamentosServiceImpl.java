package com.juan.ex2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.ex2.dao.IdepartamentosDAO;
import com.juan.ex2.dto.Departamentos;

@Service
public class DepartamentosServiceImpl  implements IdepartamentosService{
	
	@Autowired
	IdepartamentosDAO idepartamentosDAO;
	
	public List<Departamentos> listarDepartamentos(){
		return idepartamentosDAO.findAll();
	}

	@Override
	public Departamentos actualizarDepartamento(Departamentos departamentos) {
		return idepartamentosDAO.save(departamentos);
	}

	@Override
	public Departamentos guardarDepartamentos(Departamentos departamentos) {
	
		return idepartamentosDAO.save(departamentos);
	}

	@Override
	public void  eliminarDepartamento(Long Id) {
		idepartamentosDAO.deleteById(Id);;
	}

	@Override
	public Departamentos departamentosPorId(Long Id) {
		return idepartamentosDAO.findById(Id).get();
	}

	
	
}
