package ar.edu.unlam.pb2.parcial2;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.DT;
import ar.edu.unlam.pb2.Torneo;
import ar.edu.unlam.pb2.Jugador;
import ar.edu.unlam.pb2.Plantel;
import ar.edu.unlam.pb2.Posicion;

public class FutbolTest {

	@Test
    public void queSePuedaCrearUnPartidoConDosEquipos() {
		
		Torneo torneo = new Torneo("Torneo");
		
		Jugador jugador1 = new Jugador(01, 11, Posicion.DEF, "", torneo);
		Jugador jugador2 = new Jugador(02, 12, Posicion.DEF, "", torneo);
		
		Plantel plantel1 = new Plantel("");
		Plantel plantel2 = new Plantel("");
		
		plantel1.agregarJugadores(jugador2);
		plantel1.agregarJugadores(jugador1);
       
       
       assertTrue(torneo.crearPartido(plantel1, plantel2));

    }
	
	@Test
    public void queNoHayanDosJugadoresConElMismoDni() {
		
		Torneo torneo = new Torneo("Torneo");
		
		Jugador jugador1 = new Jugador(01, 11, Posicion.DEF, "", torneo);
		Jugador jugador2 = new Jugador(01, 11, Posicion.DEF, "", torneo);
		
		Plantel plantel1 = new Plantel("");
		Plantel plantel2 = new Plantel("");
		
		plantel1.agregarJugadores(jugador1);
		
		assertFalse(plantel1.agregarJugadores(jugador2));

    }
	
	@Test
    public void queSeNoPuedaCrearPartidoSiNoSeCumpleConLaCantidadDeJugadoresCorrespondienteYLanceUnaExcepcion() {
		Torneo torneo = new Torneo("Torneo");
		
		Jugador jugador1 = new Jugador(01, 11, Posicion.DEF, "", torneo);
		Jugador jugador2 = new Jugador(02, 12, Posicion.DEF, "", torneo);
		Plantel plantel1 = new Plantel("");
		Plantel plantel2 = new Plantel("");
        plantel1.agregarJugadores(jugador2);
     
        assertFalse(torneo.crearPartido(plantel1, plantel2));
    }
	

}
