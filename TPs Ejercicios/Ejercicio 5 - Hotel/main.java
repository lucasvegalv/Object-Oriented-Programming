package Hotel;

import java.util.Date;

import Hotel.Clases.Cliente;
import Hotel.Clases.Habitacion;
import Hotel.Clases.Reserva;
import Hotel.Clases.Habitacion.TipoHabitacion;


public class main {

	public static void main(String[] args) {

		// Instanciamois clientes (dni - nombre - apellido)
		Cliente juan = new Cliente("44554946", "Juan", "Gonzalez");
		Cliente pedro = new Cliente("23567834", "Pedro", "Perez");
		Cliente matias  = new Cliente("34567812", "Matias", "Abate");
		Cliente lucas = new Cliente("17654389", "Lucas", "Rubini");
		
		
		// Instanciamos reservas (cliente - tipo de habitacion (Simple, Doble, Matrimonial) - fechaComienzo - cantDias)
		Reserva reservaJuan = new Reserva(juan, TipoHabitacion.Simple, new Date() , 10);
		Reserva reservaPedro = new Reserva(pedro, TipoHabitacion.Doble, new Date() , 5);
		Reserva reservaMatias = new Reserva(matias, TipoHabitacion.Simple, new Date() , 3);
		Reserva reservaLucas = new Reserva(lucas, TipoHabitacion.Matrimonial, new Date() , 24);
		System.out.println("------------------------");
		
		System.out.println(reservaJuan.toString());
		System.out.println(reservaPedro.toString());
		System.out.println(reservaMatias.toString());
		System.out.println(reservaLucas.toString());
		System.out.println("------------------------");
		
		
		// Ver Habitaciones disponibles de acuerdo consu tipopara una fecha determinada.
		//Habitacion.verDisponibles(TipoHabitacion.Matrimonial);
		
		// Ver el precio de las habitaciones por tipo.
		Habitacion.verPrecio(TipoHabitacion.Doble);
		System.out.println("------------------------");
		
		// Consultar los descuentos generales para aplicarsobre el precio de las habitaciones.
		Habitacion.verDescuentos();
		System.out.println("------------------------");
		
		// Consultar el importe a pagar de unareserva. 
		Reserva.consultarImporteTotalReserva(0);
		System.out.println("------------------------");
	}

}
