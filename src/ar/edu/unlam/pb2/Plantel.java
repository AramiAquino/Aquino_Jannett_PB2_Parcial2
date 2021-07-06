package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;

public class Plantel {

	private String nombre;
	private Set<Jugador> equipo;

	public Plantel(String nombre, Set<Persona> equipo) {
		this.nombre = nombre;
		this.equipo = new HashSet<Jugador>();
	}
	
	public void agregarJugadores(Jugador jugador) {
		equipo.add(jugador);
	}
}
