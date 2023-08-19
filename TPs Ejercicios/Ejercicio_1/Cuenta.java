
// Punto 2
import \Ejercicio_1.Persona;

public class Cuenta {

  // Atributos
  private Persona titular;
  private float saldo;
  private boolean esActivo;

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