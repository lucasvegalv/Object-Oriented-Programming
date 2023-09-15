package Clases;

public class Materia {
	int contadorCodigo = 0;
	int codigo;
	String nombre;
	String descripcion;
	
	// Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}	
	
	// Getters
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	
	// Constructores
	public Materia(String nombre) {
		contadorCodigo++;
		this.codigo = contadorCodigo;
		this.nombre = nombre;
	}
	
	public Materia(String nombre, String descripcion) {
		contadorCodigo++;
		this.codigo = contadorCodigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
}
