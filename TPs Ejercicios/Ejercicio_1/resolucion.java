// Punto 1
public class Persona {

  // Atributos
  private String nombre;
  private String apellido;
  private int numDocumento;

  // Getters
  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public int getnumDocumento() {
    return numDocumento;
  }

  // Setters
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public void setNumDocumento(int numDocumento) {
    this.numDocumento = numDocumento;
  }

  // To String
  public String toString(){
    return (nombre + " - " + apellido + " - " + numDocumento)
  }

  // Constructor
  public Persona(String nombre, String apellido, int numDocumento) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.numDocumento = numDocumento;
  }
}

// Punto 2
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