// Punto 1
public class Persona {

  // Atributos
  private String nombre;
  private String apellido;
  private final int DNI;

  // Getters
  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public int getDNI() {
    return DNI;
  }

  // Setters
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setNombre(String apellido) {
    this.apellido = apellido;
  }

  public void setNombre(int DNI) {
    this.DNI = DNI;
  }

  // To String


  // Constructor
  public Persona(String nombre, String apellido, int DNI) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.DNI = DNI;
  }
}

// Punto 2
public class Cuenta {

  // Atributos
  private Persona titular;
  private float saldo;
  private boolean esActivo;

  // Getters
  public Persona getTitular(int DNI) {
    return (titular, saldo,)
  }

  // Constructor: Titular y saldo obligatorio
  public Cuenta (Persona titular, float saldo) {
    this.titular = titular;
    this.saldo = saldo;
    esActivo = true;
  }

  // Constructor: Titular obligatorio
  public Cuenta (Persona titular) {
  this.titular = titular;
  esActivo = true;
  }
}