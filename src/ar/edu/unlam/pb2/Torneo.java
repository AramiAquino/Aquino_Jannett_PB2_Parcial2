package ar.edu.unlam.pb2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Torneo extends Exception{

	private String nombre;
	private Map <String, Plantel> partido;
	private Integer idPartido = 0;
	private Boolean agg;
	private List goles;
	
	public Torneo(String nombre) {
		this.nombre = nombre;
		this.partido = new HashMap<>();
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Map<String, Plantel> getPartido() {
		return partido;
	}


	public void setPartido(Map<String, Plantel> partido) {
		this.partido = partido;
	}


	public Boolean crearPartido(Plantel equipo1, Plantel equipo2){
        if(this.partido.size()<2) {
        	this.partido.put(equipo1.getNombre(), equipo1);
        	this.partido.put(equipo2.getNombre(), equipo2);
        	return true;
        }
        return false;
    }

	
	public List<Gol> hayGol(Jugador jugador, String minuto) {
        Gol gol = new Gol(jugador, minuto);
        if(this.agg == true) {
            this.goles.add(gol);
        }
        return goles;

    }
	
}
