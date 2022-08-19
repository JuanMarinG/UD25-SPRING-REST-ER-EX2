package com.juan.ex2.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Departamentos")
public class Departamentos {

	//ATRIBUTOS TABLA DEPARTAMENTOS

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int Codigo;
		private String Nombre;
		private int Presupuesto;
	
		@JsonIgnore
		@OneToMany
		@JoinColumn(name = "DNI")
		private  List <Empleados> Empleados;

		public int getCodigo() {
			return Codigo;
		}

		public void setCodigo(int codigo) {
			Codigo = codigo;
		}

		public String getNombre() {
			return Nombre;
		}

		public void setNombre(String nombre) {
			Nombre = nombre;
		}

		public int getPresupuesto() {
			return Presupuesto;
		}

		public void setPresupuesto(int presupuesto) {
			Presupuesto = presupuesto;
		}

		public List<Empleados> getEmpleados() {
			return Empleados;
		}

		public void setEmpleados(List<Empleados> empleados) {
			this.Empleados = empleados;
		}

		@Override
		public String toString() {
			return "Departamentos [Codigo=" + Codigo + ", Nombre=" + Nombre + ", Presupuesto=" + Presupuesto
					+ ", empleados=" + Empleados + "]";
		}

	


	

}
