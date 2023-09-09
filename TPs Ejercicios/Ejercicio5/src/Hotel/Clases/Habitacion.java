package Hotel.Clases;



enum EstadoHabitacion {
	Disponible, 
	Ocupada
}

public class Habitacion {
	
	public enum TipoHabitacion {
		Simple,
		Doble, 
		Matrimonial
	}
	
	int numero = 0;
	int piso = 1;
	int precio;
	EstadoHabitacion estado;
	TipoHabitacion tipo;
	
	
	Habitacion[] habitacionesArr = new Habitacion[100];
	
	// El usuario "crea" una habitacon indicandonos unicamente el tipo de habitacion que quiere
	public Habitacion(TipoHabitacion tipo) {
		this.numero += 1;
		this.estado = EstadoHabitacion.Ocupada;
		
		// Precio en funcion del tipo de habitacion
		if(tipo == TipoHabitacion.Simple) {
			this.precio = 100;
		} else if(tipo == TipoHabitacion.Doble) {
			this.precio = 200;
		} else {
			this.precio = 250;
		}
	}
	
	public int[] verDisponibles(TipoHabitacion tipoHabitacion) {
		
		// Creamos nuestro array que va a almacenar las habitaciones disponibles
		int[] habitacionesDisponibles = new int[100];
		
		// Obtenemos el array de reservas que contiene a cada habitacion y sus estados
		int reservaArrLong = (Reserva.reservarArr).length;
		
		// Iteramos el array de reservas en busca de habitaciones del tipo que queremos y con estado disponible
		for(int i = 0; i < reservaArrLong; i++) {
			Habitacion habitacionReserva = Reserva.reservarArr[i].habitacion;
			
			// Si encontramos una habitacion con el tipo y estado que queremos, la agregamos a nuestro array
			if((habitacionReserva.tipo == tipoHabitacion) &&  habitacionReserva.estado == EstadoHabitacion.Disponible) {
				int pos = habitacionesDisponibles.length;
				habitacionesDisponibles[pos] = habitacionReserva.numero; // Almacenamos el numero de habitacion unicamente
			}
		}
		
		// Devolvemos nuestro array
		System.out.print("Las habitaciones disponibles son las siguientes (numero de habitacion): ");
		System.out.print("--------------------------------------------------");
		return habitacionesDisponibles;
	}
	
	public int verPrecio(TipoHabitacion tipoHabitacion) {
		int precio;
		
		if(tipoHabitacion == TipoHabitacion.Simple) {
			precio = 100;
		} else if(tipoHabitacion == TipoHabitacion.Doble) {
			precio = 200;
		} else {
			precio = 250;
		}
		
		return precio;
	}
	
	public String verDescuentos() {
		String respuesta = 
				"Los descuentos son los siguientes: Habitacion Simple 30% OFF --> $70 en vez de $100 - Habitacion Doble 20 OFF --> $160 en vez de $200 - Habitacion Matrimonial 10% OFF --> $225 en vez de $250";
		
		return respuesta;
	}
}
