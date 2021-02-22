package com.dam.DAMHibernate_Herencia_SingleTable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "A")
public class Alumno extends Persona {
	
	@Column
	private String ciclo;

	public Alumno(String dni, String nombre, int edad, String ciclo) {
		super(dni, nombre, edad);
		this.ciclo = ciclo;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	
}
