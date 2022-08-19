package com.juan.ex2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.ex2.dao.IempleadosDAO;
import com.juan.ex2.dto.Empleados;

@Service
public class EmpleadosServiceImpl implements IempleadosService{

	@Autowired
	IempleadosDAO iempleadosDAO;

	@Override
	public List<Empleados> listarEmpleados() {
		// TODO Auto-generated method stub
		return iempleadosDAO.findAll();
	}

	@Override
	public Empleados actualizarEmpleados(Empleados empleados) {
		// TODO Auto-generated method stub
		return iempleadosDAO.save(empleados);
	}

	@Override
	public Empleados guardarEmpleados(Empleados empleados) {
		// TODO Auto-generated method stub
		return iempleadosDAO.save(empleados);
	}

	@Override
	public void eliminarEmpleado(Long Id) {
		// TODO Auto-generated method stub
		iempleadosDAO.deleteById(Id);
	}

	@Override
	public Empleados empleadosPorId(Long Id) {
		// TODO Auto-generated method stub
		return iempleadosDAO.findById(Id).get();
	}
	
	
}
