package Classes;
import java.util.Scanner;
import Classes.Persona;

public class Cuenta {

  Scanner scanner = new Scanner(System.in);

  // Atributos
  private Persona titular;
  private float saldo;
  private boolean esActivo;

  // Metodo para ingresar dinero a la cuenta
  public void ingresar (double importe) {
     if(importe > 0) { // Si ingresa un importe negativo no hacemos nada
      this.saldo += importe;
     }
  }

  // Metodo para retirar dinero de la cuenta
  public void retirar(double importe) {
    
    if((this.saldo - importe) >= 0){
      this.saldo -= importe;
      System.out.print("Retiro realizado con exito. Su saldo actualizado es de $" + this.saldo);
    } else { // Si el resultado del importe es menor a cero ofrecemos retirar todo o cancelar el retiro
      System.out.print("Esta queriendo retirar mas de lo disponible. Quiere retirar el saldo existente o cancelar el retiro? R (retirar) - C (cancelar) ");
      String respuesta = scanner.nextLine();
      
      while(!respuesta.equalsIgnoreCase("R") && !respuesta.equalsIgnoreCase("C")) { // Solicitamos respuesta hasta que ingrese lo solicitado
        System.out.print("Por favor, indique que opcion quiere: R (retirar saldo existente) - C (cancelar operacion) ");
        respuesta = scanner.nextLine();
      }

      if(respuesta.equalsIgnoreCase("R")) {
        this.saldo = 0;
        System.out.print("Retiro realizado con exito. Su saldo actualizado es de $" + this.saldo);
      } else {
        System.out.print("Retiro cancelado");
      }
    }
  }

  // Metodo para transferir dinero a otra cuenta
  public void transferir(Cuenta destino, double importe) {
    
    if(importe > this.saldo) {
      System.out.print("El monto es mayor al saldo disponible. Quiere transferirlo todo o cancelar la operacion? T (transferir) - C (cancelar)");
      String respuesta = scanner.nextLine();

      while(!respuesta.equalsIgnoreCase("T") && !respuesta.equalsIgnoreCase("C")) {
        System.out.print("Por favor, indique que opcion quiere: T (transferir) - C (cancelar)");
        respuesta = scanner.nextLine();
      }

      if(respuesta.equalsIgnoreCase("T")) {
        destino.saldo += this.saldo;
      } else {
        System.out.print("Operacion cancelada");
      }

    }

  }

  // Getters
  public Persona getTitular() {
    return titular;
  }

  public float getSaldo(){
    return saldo;
  }

  public boolean esActivo() {
    return esActivo;
  }

  // Setters
  public void setTitular(Persona titular){
  this.titular = titular;
}

  public void setSaldo(float saldo){
    this.saldo = saldo;
  }

  public void setEsActivo(boolean esActivo){
    this.esActivo = esActivo;
  }

  // To String
  public String toString(){
    String cuentaActivada;

    if(esActivo == true) {
      cuentaActivada = "Activo";
    }
    else {
      cuentaActivada = "Inactivo";
    }

    return (titular + " - $" + saldo + " - " + cuentaActivada);
  }

  // Constructor: Titular y saldo obligatorio
  public Cuenta (Persona titular, float saldo) {
    this.titular = titular;
    this.saldo = saldo;
    this.esActivo = true;
  }

  // Constructor: Titular obligatorio
  public Cuenta (Persona titular) {
  this.titular = titular;
  this.saldo = 0;
  this.esActivo = true;
  }

}
