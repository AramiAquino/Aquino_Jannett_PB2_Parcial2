package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;

public class Plantel {

	private String nombre;
	private Set<Jugador> equipo;

	public Plantel(String nombre) {
		this.nombre = nombre;
		this.equipo = new HashSet<Jugador>();
	}
	
	public Boolean agregarJugadores(Jugador jugador) {

			return this.equipo.add(jugador);
	
			
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Jugador> getEquipo() {
		return equipo;
	}

	public void setEquipo(Set<Jugador> equipo) {
		this.equipo = equipo;
	}

}
