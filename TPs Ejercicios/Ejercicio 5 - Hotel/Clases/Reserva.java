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
	
	static int contador = 0;
	int idReserva;
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
	@Override
	public String toString() {
	    String respuesta = (cliente.nombre + " " + cliente.apellido + " - N° habitación: #" + habitacion.numero + " - Importe: $" + importeTotal + " ($" + habitacion.precio + " * " + cantDias + " días).");
	    return respuesta;
	}

	// Constructor para crear/agregar una nueva reserva
	public Reserva(Cliente cliente, TipoHabitacion tipoHabitacion, Date fechaComienzo, int cantDias) {
		idReserva = contador++;
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
		cliente.cantReservas += 1;
		if(cliente.cantReservas > 6) {
			this.senia = 0;
			this.cliente.tipoCliente = TipoDeCliente.Habitual;
		}
		
		System.out.println(contador);
		
		// Agregamos la reserva al array
		reservarArr[contador - 1] = this;
		
		System.out.println("Listo, ya creamos tu reserva. Podes realizar consultas usando el identificador de la misma: #" + this.idReserva);
	}
	
	public static int consultarImporteTotalReserva(int id) {
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
		System.out.println("El importe total a pagar por su reserva (#" + id + ") es de $" + importe);
		return importe;
	}

}






