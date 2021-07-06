package ar.edu.unlam.pb2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Torneo {

	private String nombre;
	private Map <Integer, Plantel> partido;
	
	public Torneo(String nombre, Map<Integer, Plantel> partido) {
		this.nombre = nombre;
		this.partido = new HashMap<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Map<Integer, Plantel> getPartido() {
		return partido;
	}

	public void setPartido(Map<Integer, Plantel> partido) {
		this.partido = partido;
	}
	
	
	
	
}
