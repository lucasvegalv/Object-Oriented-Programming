import Classes.Persona;
import Classes.Cuenta;

// 4.Crear un programa (Clase Main) que utilice las clases indicadas y además: 
//   a.Cree 2 titulares 
//   b.Cree una cuenta para cada titular. 
//   c.Cree una cuenta con Titular (sin saldo) y otra con Titular y saldo. 
//   d.Retire Dinero en la primera cuenta. Muestre el resultado por pantalla 
//   e.Ingrese Dinero de la segunda cuenta. Muestre el saldo existente por pantalla 
//   f.Verifique si ambas cuentas tienen el mismo saldo y muéstrelo por pantalla. 


public class main {
    public static void main(String[] args) throws Exception {

        // 4a
        Persona juan = new Persona("Juan", "Perez", 18456783);
        Persona lucia = new Persona("Lucia", "Silva", 38956723);

        // 4b y 4c
        Cuenta cuentaJuan = new Cuenta(juan);
        Cuenta cuentaLucia = new Cuenta(lucia, 0);

        // 4d
        cuentaJuan.retirar(0);

        // 4e
        cuentaLucia.ingresar(100);
        System.out.println(cuentaLucia.getSaldo());

        // 4f
        double saldoJuan = cuentaJuan.getSaldo();
        double saldoLucia = cuentaLucia.getSaldo();

        if(saldoLucia > saldoJuan) {
            System.out.print("El saldo de Lucia ($" + saldoLucia + ") es mayor al de Juan ($" + saldoJuan + ")");
        } else if (saldoLucia < saldoJuan) {
            System.out.print("El saldo de Juan ($" + saldoJuan + ") es mayor al de Lucia ($" + saldoLucia + ")");
        } else {
            System.out.print("El saldo de Lucia ($" + saldoLucia + ") es igual al de Juan ($" + saldoJuan + ")");
        }

    }
}
