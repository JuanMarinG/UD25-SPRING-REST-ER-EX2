package com.juan.ex2.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Empleados")
public class Empleados {

	//ATRIBUTOS TABLA EMPLEADOS
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String DNI;
	private String Nombre;
	private String Apellidos;
	private int Departamento;
	
	@ManyToOne
	@JoinColumn(name = "Codigo")
	private Departamentos departamentos;
}
