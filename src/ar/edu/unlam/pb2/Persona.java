package ar.edu.unlam.pb2;

import java.util.Map;

public abstract class Persona {

	private Integer dni;
	private String nombre;
	private Torneo equipo;

	public Persona(Integer dni, String nombre, Torneo equipo) {
		this.nombre = nombre;
		this.equipo = equipo;
		this.dni = dni;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Torneo getEquipo() {
		return equipo;
	}

	public void setEquipo(Torneo equipo) {
		this.equipo = equipo;
	}
	
	
}
