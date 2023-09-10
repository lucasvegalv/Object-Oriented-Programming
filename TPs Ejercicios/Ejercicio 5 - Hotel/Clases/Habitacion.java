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
	
	static int contador = 0;
	int numero;
	int piso = 1;
	int precio;
	EstadoHabitacion estado;
	TipoHabitacion tipo;
	
	
	Habitacion[] habitacionesArr = new Habitacion[100];
	
	// El usuario "crea" una habitacon indicandonos unicamente el tipo de habitacion que quiere
	public Habitacion(TipoHabitacion tipo) {
		this.numero = contador ++;
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
	
	public static int[] verDisponibles(TipoHabitacion tipoHabitacion) {
	    int[] habitacionesDisponibles = new int[100];
	    int contadorDisponibles = 0;

	    // Itera a través de las reservas y verifica si la habitación está disponible y es del tipo deseado
	    for (int i = 0; i < Reserva.contador; i++) {
	        Reserva reserva = Reserva.reservarArr[i];
	        Habitacion habitacionReserva = reserva.habitacion;

	        if (habitacionReserva != null &&
	            habitacionReserva.tipo == tipoHabitacion &&
	            habitacionReserva.estado == EstadoHabitacion.Disponible) {
	            habitacionesDisponibles[contadorDisponibles] = habitacionReserva.numero;
	            contadorDisponibles++;
	        }
	    }

	    // Crea un nuevo arreglo con el tamaño correcto y copia los datos
	    int[] disponibles = new int[contadorDisponibles];
	    System.arraycopy(habitacionesDisponibles, 0, disponibles, 0, contadorDisponibles);

	    System.out.println("Las habitaciones disponibles son las siguientes (número de habitación): ");
	    for (int numero : disponibles) {
	        System.out.print(numero + " ");
	    }
	    System.out.println("\n--------------------------------------------------");

	    return disponibles;
	}

	public static int verPrecio(TipoHabitacion tipoHabitacion) {
		int precio;
		
		if(tipoHabitacion == TipoHabitacion.Simple) {
			precio = 100;
		} else if(tipoHabitacion == TipoHabitacion.Doble) {
			precio = 200;
		} else {
			precio = 250;
		}
		
		System.out.println("La habitacion " + tipoHabitacion + " tiene un precio de $" + precio + " diarios.");
		return precio;
	}
	
	public static String verDescuentos() {
		String respuesta = 
				"Los descuentos son los siguientes: Habitacion Simple 30% OFF --> $70 en vez de $100 - Habitacion Doble 20 OFF --> $160 en vez de $200 - Habitacion Matrimonial 10% OFF --> $225 en vez de $250";
		
		System.out.println(respuesta);
		return respuesta;
	}
}
