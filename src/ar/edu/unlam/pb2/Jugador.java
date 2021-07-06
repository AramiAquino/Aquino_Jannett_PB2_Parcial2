package ar.edu.unlam.pb2;

public class Jugador extends Persona implements JugadorI{

	private Integer dni;
	private Integer nroCamiseta;
	private Posicion posicion;
	private String nombre;
	private Integer edad;
	
	public Jugador(Integer dni, Integer nroCamiseta, Posicion posicion, String nombre, Torneo equipo) {
		super(dni, nombre, equipo);
		this.nroCamiseta = nroCamiseta;
		this.posicion = posicion;
	}

	


	public Integer getDni() {
		return dni;
	}




	public void setDni(Integer dni) {
		this.dni = dni;
	}




	public Integer getNroCamiseta() {
		return nroCamiseta;
	}




	public void setNroCamiseta(Integer nroCamiseta) {
		this.nroCamiseta = nroCamiseta;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public Integer getEdad() {
		return edad;
	}




	public void setEdad(Integer edad) {
		this.edad = edad;
	}




	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	@Override
	public Integer getCamista() {
		// TODO Auto-generated method stub
		return this.nroCamiseta;
	}

	@Override
	public Posicion getPosicion() {
		// TODO Auto-generated method stub
		return this.posicion;
	}
	
	
	
}
