package com.juan.ex2.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Departamentos")
public class Departamentos {

	//ATRIBUTOS TABLA FABRICANTES

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int Codigo;
		private String Nombre;
		private int Presupuesto;
	
	
		@OneToMany
		@JoinColumn(name = "Departamento")
		private Empleados empleados;
		
		
	
}
