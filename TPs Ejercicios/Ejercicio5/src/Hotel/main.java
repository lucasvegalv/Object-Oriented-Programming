package Hotel;

import java.util.Date;

import Hotel.Clases.Cliente;
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
		
		System.out.print(reservaJuan.getCliente());
		System.out.print("------------------------");
		System.out.print(reservaJuan.getCantDias());
		System.out.print("------------------------");
		System.out.print(reservaJuan.getEstado());
		System.out.print("------------------------");
		System.out.print(reservaJuan.getHabitacion());
		System.out.print("------------------------");
		
	}

}
