package Clases;

public class Carrera {
	int contadorCodigo = 1000;
	int codigo;
	String nombre;
	String descripcion;
	Materia materias[];
	boolean estado;
	
	// Metodos
	public void agregarMateria(Materia materia) {
		for(int i = 0; i < materias.length; i++) {
			if(materias[i] == null) {
				materias[i] = materia;
				System.out.println("Materia agregada: " + materia.getNombre());
				return;
			}
		}
	}

	public void eliminarMateria(Materia materia) {
		for(int i = 0; i < materias.length; i++) {
			if(materias[i] != null && materias[i].equals(materia)) {
				int ultimoElemento = materias.length - 1;
				materias[i] = materias[ultimoElemento];
				System.out.println("Materia eliminada: " + materia.getNombre());
				return;
			}
		}
	}
	
	// Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	
	// Getters
	public int getCodigo() {
		return this.codigo;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public Materia[] getMaterias() {
		return this.materias;
	}
	
	public String getEstado() {
		if(this.estado) {
			return "Activa";
		} else {
			return "Desactiva";
		}
	}
	
	// Constructores
	public Carrera (String nombre, int cantMaterias) {
		contadorCodigo ++;
		this.codigo = contadorCodigo;
		this.nombre = nombre;
		this.materias = new Materia[cantMaterias];
		this.estado = true;
	}
	
	public Carrera (String nombre, String descripcion, int cantMaterias) {
		contadorCodigo ++;
		this.codigo = contadorCodigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.materias = new Materia[cantMaterias];
		this.estado = true;
	}
}
