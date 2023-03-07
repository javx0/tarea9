package personas;

import java.util.*;


/**
 * Class PuestoTrabajo
 */
public class PuestoTrabajo{

  //
  // Fields
  //

  private String nombre;
  private String fechaInicio;
  private String fechaFin;
  private int salario;
  private Persona persona;
  private String nombreEmpresa;
  
  //
  // Constructors
  //

  public PuestoTrabajo(String nombre, String fechaInicio, String fechaFin, int salario, Persona persona, String nombreEmpresa) {
    this.nombre = nombre;
    this.fechaInicio = fechaInicio;
    this.fechaFin = fechaFin;
    this.salario = salario;
    this.persona = persona;
    this.nombreEmpresa = nombreEmpresa;
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
   * Set the value of fechaInicio
   * @param newVar the new value of fechaInicio
   */
  public void setFechaInicio (String newVar) {
    fechaInicio = newVar;
  }

  /**
   * Get the value of fechaInicio
   * @return the value of fechaInicio
   */
  public String getFechaInicio () {
    return fechaInicio;
  }

  /**
   * Set the value of fechaFin
   * @param newVar the new value of fechaFin
   */
  public void setFechaFin (String newVar) {
    fechaFin = newVar;
  }

  /**
   * Get the value of fechaFin
   * @return the value of fechaFin
   */
  public String getFechaFin () {
    return fechaFin;
  }

  /**
   * Set the value of salario
   * @param newVar the new value of salario
   */
  public void setSalario (int newVar) {
    salario = newVar;
  }

  /**
   * Get the value of salario
   * @return the value of salario
   */
  public int getSalario () {
    return salario;
  }

  /**
   * Set the value of persona
   * @param newVar the new value of persona
   */
  public void setPersona (Persona newVar) {
    persona = newVar;
  }

  /**
   * Get the value of persona
   * @return the value of persona
   */
  public Persona getPersona () {
    return persona;
  }

  /**
   * Set the value of nombreEmpresa
   * @param newVar the new value of nombreEmpresa
   */
  public void setNombreEmpresa (String newVar) {
    nombreEmpresa = newVar;
  }

  /**
   * Get the value of nombreEmpresa
   * @return the value of nombreEmpresa
   */
  public String getNombreEmpresa () {
    return nombreEmpresa;
  }

  //
  // Other methods
  //


  @Override
  public String toString() {
    return "PuestoTrabajo{" +
            "nombre='" + nombre + '\'' +
            ", fechaInicio='" + fechaInicio + '\'' +
            ", fechaFin='" + fechaFin + '\'' +
            ", salario=" + salario +
            ", nombreEmpresa='" + nombreEmpresa + '\'' +
            ", persona=" + persona +
            '}';
  }
}
