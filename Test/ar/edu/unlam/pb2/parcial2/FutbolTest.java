package ar.edu.unlam.pb2.parcial2;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.DT;
import ar.edu.unlam.pb2.Torneo;
import ar.edu.unlam.pb2.Jugador;

public class FutbolTest {

	@Test
    public void queSePuedaAgregarJugadoresYDT() {
        Club actual=new Club("Argentina");

        actual.agregarPersona(new DT(1,"Lionel Scaloni","Argentina",45));
        actual.agregarPersona(new Jugador(2,2,TipoDePosicion.DEF,"Jorge Nitales","Argentina"));
        actual.agregarPersona(new Jugador(3,3,TipoDePosicion.DEF,"Marco Secil","Argentina"));

        actual.agregarPersona(new Jugador(4,4,TipoDePosicion.DEF,"Gonzalo Montiel","Argentina"));
        actual.agregarPersona(new Jugador(5,5,TipoDePosicion.DEF,"Lionel Messi","Argentina"));
        actual.agregarPersona(new Jugador(6,6,TipoDePosicion.MED,"Leandro Paredes","Argentina"));
        actual.agregarPersona(new Jugador(7,7,TipoDePosicion.MED,"Marcos Acuña","Argentina"));
        actual.agregarPersona(new Jugador(8,8,TipoDePosicion.DEL,"Nicolás Tagliafico","Argentina"));

        assertEquals((Integer) 8, actual.getCantidadPersona());

    }
	
	@Test
    public void queSePuedaCrearUnMiembro() {
        Torneo argentina = new Torneo("Argentina");

        Jugador jugador1 = new Jugador(001, 10, posicion.DEL, "Lionel Messi", argentina.getNombre());
        DT dt1 = new DT(002, "Lionel Scaloni", argentina.getNombre(), 43);

    }

	@Test(expected = Exception.class)
	public void queLanceExcepcionDeJugadorNoEncontrado() throws Exception {
	//PREPARACION
	Double dividendo = 5.0;
	Double divisor = 0.0;
	Calculadora calcu = new Calculadora();
	//EJECUCION
	calcu.dividir(dividendo, divisor);
	}

}
