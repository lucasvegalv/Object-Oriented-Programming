package Ejercicio_1;

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
    return (nombre + " - " + apellido + " - " + numDocumento);
  }

  // Constructor
  public Persona(String nombre, String apellido, int numDocumento) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.numDocumento = numDocumento;
  }
}
