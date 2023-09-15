package Clases;

public class Profesor {
	String tipoDocumento;
	double numDocumento;
	String nombre;
	double legajo;
	Materia materiasDictadas[];
	boolean disponibilidad[][];
	
	// Metodos
	public void agregarMateriaDictada(Materia materia) {
		int i = 0;
		while(materiasDictadas[i] != materia && i < materiasDictadas.length) {
			if(materiasDictadas[i] == null) {
				materiasDictadas[i] = materia;
			}
			i++;
		}
	}
	
	public void eliminarMateriaDictada(Materia materia) {
	    int i = 0;
	    while (i < materiasDictadas.length && materiasDictadas[i] != null) {
	        if (materiasDictadas[i].equals(materia)) {
	            materiasDictadas[i] = materiasDictadas[materiasDictadas.length - 1];
	            materiasDictadas[materiasDictadas.length - 1] = null;
	            return; 
	        }
	        i++;
	    }
	}
	
	// Setters
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public void setNumDocumento(double numDocumento) { 
        this.numDocumento = numDocumento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLegajo(double legajo) {
        this.legajo = legajo;
    }
	
    public void setDisponibilidad(int dia, int turno, boolean disponibile_ocupado) {
        if (dia >= 0 && dia < disponibilidad.length && turno >= 0 && turno < disponibilidad[0].length) {
            disponibilidad[dia][turno] = disponibile_ocupado;
        }
    }
	
	
    // Getters
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public double getNumDocumento() {
        return numDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public double getLegajo() {
        return legajo;
    }

    public String getDisponibilidad(int dia, int turno) {
    	boolean dispo = false;
    	if (dia >= 0 && dia < disponibilidad.length && turno >= 0 && turno < disponibilidad[0].length) {
            dispo = disponibilidad[dia][turno];
        }
		
        if (dispo) {
        	return "Disponible";
        } else {
        	return "No disponible";
        }
    }

	// Constructores
	public Profesor() {
		 disponibilidad = new boolean[5][3];
		 this.materiasDictadas = new Materia[15]; // Maximo puede dictar 15 materias (5 dias * 3 turnos)
	}
	
	public Profesor(String tipoDocumento, double numDocumento, String nombre) {
		this.tipoDocumento = tipoDocumento;
		this.numDocumento = numDocumento;
		this.nombre = nombre;
		this.materiasDictadas = new Materia[15]; // Maximo puede dictar 15 materias (5 dias * 3 turnos)
		disponibilidad = new boolean[5][3];
	}
	
    
}
