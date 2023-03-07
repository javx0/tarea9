package personas;

import java.util.*;


/**
 * Class Persona
 */
public class Persona {

  //
  // Fields
  //

  private String nombre;
  private String apellido1;
  private String apellido2;
  private String fecha;
  private char sexo;
  private int numeroIdentificacion;
  
  //
  // Constructors
  //

  public Persona(String nombre, String apellido1, String apellido2, String fecha, char sexo, int numeroIdentificacion) {
    this.nombre = nombre;
    this.apellido1 = apellido1;
    this.apellido2 = apellido2;
    this.fecha = fecha;
    this.sexo = sexo;
    this.numeroIdentificacion = numeroIdentificacion;
  }


  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of apellido1
   * @param newVar the new value of apellido1
   */
  public void setApellido1 (String newVar) {
    apellido1 = newVar;
  }

  /**
   * Get the value of apellido1
   * @return the value of apellido1
   */
  public String getApellido1 () {
    return apellido1;
  }

  /**
   * Set the value of apellido2
   * @param newVar the new value of apellido2
   */
  public void setApellido2 (String newVar) {
    apellido2 = newVar;
  }

  /**
   * Get the value of apellido2
   * @return the value of apellido2
   */
  public String getApellido2 () {
    return apellido2;
  }

  /**
   * Set the value of fecha
   * @param newVar the new value of fecha
   */
  public void setFecha (String newVar) {
    fecha = newVar;
  }

  /**
   * Get the value of fecha
   * @return the value of fecha
   */
  public String getFecha () {
    return fecha;
  }

  /**
   * Set the value of sexo
   * @param newVar the new value of sexo
   */
  public void setSexo (char newVar) {
    sexo = newVar;
  }

  /**
   * Get the value of sexo
   * @return the value of sexo
   */
  public char getSexo () {
    return sexo;
  }

  /**
   * Set the value of numeroIdentificacion
   * @param newVar the new value of numeroIdentificacion
   */
  public void setNumeroIdentificacion (int newVar) {
    numeroIdentificacion = newVar;
  }

  /**
   * Get the value of numeroIdentificacion
   * @return the value of numeroIdentificacion
   */
  public int getNumeroIdentificacion () {
    return numeroIdentificacion;
  }

  //
  // Other methods
  //


  @Override
  public String toString() {
    return "\n" + "Persona{" +
            "nombre='" + nombre + '\'' +
            ", apellido1='" + apellido1 + '\'' +
            ", apellido2='" + apellido2 + '\'' +
            ", fecha='" + fecha + '\'' +
            ", sexo=" + sexo +
            ", numeroIdentificacion=" + numeroIdentificacion +
            '}' + "\n";
  }
}
