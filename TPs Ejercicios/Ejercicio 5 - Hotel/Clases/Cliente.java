package Hotel.Clases;

enum TipoDeCliente {
	Habitual,
	Esporadico
}

public class Cliente {
	
	Cliente[] clientesArr = new Cliente[150]; 
	
	// Atributos
	String dni;
	String nombre;
	String apellido;
	TipoDeCliente tipoCliente;
	int cantReservas;
	
	// Getters
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public int getCantidadReservas() {
		return this.cantReservas;
	}
	
	public TipoDeCliente getTipoCliente() {
		return this.tipoCliente;
	}
	
	// To String
	public String toString() {
	    String respuesta = (this.dni + " - " + this.nombre + " - " + this.apellido);
	    return respuesta;
	}
	
	
	// Constructor
	public Cliente(String dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cantReservas = 1;
	}
}
