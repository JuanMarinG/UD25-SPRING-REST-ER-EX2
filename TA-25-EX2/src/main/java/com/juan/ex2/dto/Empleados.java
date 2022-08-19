package com.juan.ex2.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="empleados")
public class Empleados {

	
	@Id
	private String DNI;
	private String Nombre;	
	private String Apellidos;	
	
	@ManyToOne
    @JoinColumn(name="departamento")
    private Departamentos departamento;
	

	public Empleados(){}	
	
	
	public Empleados(String Dni,String nombre, String apellidos, Departamentos departamento) {
		this.DNI = Dni;
		this.Nombre = nombre;
		this.Apellidos = apellidos;
		this.departamento = departamento;
	}


	@Override
	public String toString() {
		return "Empleados [DNI=" + DNI + ", nombre=" + Nombre + ", apellidos=" + Apellidos + ", Departamento="
				+ departamento + "]";
	}


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
		this.Nombre = nombre;
	}


	public String getApellidos() {
		return Apellidos;
	}


	public void setApellidos(String apellidos) {
		this.Apellidos = apellidos;
	}


	public Departamentos getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamentos departamento) {
		this.departamento = departamento;
	}
		
}
