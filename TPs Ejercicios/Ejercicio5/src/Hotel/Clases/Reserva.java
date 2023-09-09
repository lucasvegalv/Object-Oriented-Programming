package Hotel.Clases;
import java.util.Date;

import Hotel.Clases.Habitacion.TipoHabitacion;

enum EstadoReserva {
	Activa,
	Tomada, 
	Cumplida,
	Seniada,
	Vencida,
	Cancelada
}

public class Reserva {

	// Damos por entendido que tenemos un maximo de habitaciones, por lo tanto, un maximo de reservas.
	// Vamos a usar este arreglo para almacenar cada una una de las reservas y asi, despues, poder iterarlas y buscar habitaciones disponibles, cambiar estados, agregar nuevas, calcular importes, etc.
	public static Reserva[] reservarArr = new Reserva[100]; 
	
	int idReserva = 0;
	Cliente cliente;
	Habitacion habitacion;
	Date fechaComienzo;
	int cantDias;
	int importeTotal;
	int senia;
	EstadoReserva estado;		
	
	
	// Getters
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public int getHabitacion() {
		return this.habitacion.numero;
	}
	
	public Date getFechaComienzo() {
		return this.fechaComienzo;
	}
	
	public int getCantDias() {
		return this.cantDias;
	}
	
	public int getImporteTotal() {
		return this.importeTotal;
	}
	
	public int getSenia() {
		return this.senia;
	}
	
	public EstadoReserva getEstado() {
		return this.estado;
	}
	
	public static Reserva[] getReserva() {
		return reservarArr;
	}
	
	// To String
	public String toString() {
	    String respuesta = (this.cliente.nombre + this.cliente.apellido + " - Nro habitacion: " + this.habitacion.numero + " - Importe: " + this.importeTotal);
	    System.out.print(respuesta);
	    return respuesta;
	}
	
	
	// Constructor para crear/agregar una nueva reserva
	public Reserva(Cliente cliente, TipoHabitacion tipoHabitacion, Date fechaComienzo, int cantDias) {
		this.idReserva += 1;
		this.cliente = cliente;
		this.fechaComienzo = fechaComienzo;
		this.cantDias = cantDias;
		this.estado = EstadoReserva.Activa;
		this.senia = (this.importeTotal) / 2;
		this.cliente.tipoCliente = TipoDeCliente.Esporadico;
		
		Habitacion nuevaHabitacion = new Habitacion(tipoHabitacion);
		this.habitacion = nuevaHabitacion;
		this.importeTotal = cantDias * (nuevaHabitacion.precio);
		
		// El numero de reservas por cliente incrementa
		cliente.cantReservas =+ 1;
		if(cliente.cantReservas > 6) {
			this.senia = 0;
			this.cliente.tipoCliente = TipoDeCliente.Habitual;
		}
		
		System.out.print("Listo, ya creamos tu reserva. Podes realizar consultas usando el identificador de la misma: " + this.idReserva);
	}
	
	public int consultarImporteTotalReserva(int id) {
		int reservasArrLong = reservarArr.length;
		int importe = 0;
		
		// Podriamos aprovecharnos del ordenamiento de los IDs para buscar con busqueda binaria y ser mas eficientes
		for (int i = 0; i < reservasArrLong; i ++) {
			
			if(id > reservasArrLong) {
				System.out.print("Su numero de reserva no existe. Por favor intente de nuevo.");
			}
			
			if(reservarArr[i].idReserva == id) {
				importe = reservarArr[i].importeTotal;
				break;
			}	
		}
		return importe;
	}




}






