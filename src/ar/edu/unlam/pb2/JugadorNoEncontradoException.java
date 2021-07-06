package ar.edu.unlam.pb2;

public class JugadorNoEncontradoException extends Exception {
	public JugadorNoEncontradoException() {
		super("El jugador no existe");
	}
}
