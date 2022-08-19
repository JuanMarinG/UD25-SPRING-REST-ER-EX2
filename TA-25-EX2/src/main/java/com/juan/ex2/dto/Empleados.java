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
	
	@ManyToOne
	@JoinColumn(name = "Codigo")
	private Departamentos departamentos;

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public Departamentos getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(Departamentos departamentos) {
		this.departamentos = departamentos;
	}

	@Override
	public String toString() {
		return "Empleados [DNI=" + DNI + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", departamentos="
				+ departamentos + "]";
	}

	
	
}
