package formas;

/**
 * Class Circulo
 */
public class Circulo {

  //
  // Fields
  //

  private String color;
  private double Diametro;
  
  //
  // Constructors
  //
  public Circulo () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of color
   * @param newVar the new value of color
   */
  public void setColor (String newVar) {
    color = newVar;
  }

  /**
   * Get the value of color
   * @return the value of color
   */
  public String getColor () {
    return color;
  }

  /**
   * Set the value of Diametro
   * @param newVar the new value of Diametro
   */
  public void setDiametro (double newVar) {
    Diametro = newVar;
  }

  /**
   * Get the value of Diametro
   * @return the value of Diametro
   */
  public double getDiametro () {
    return Diametro;
  }

  //
  // Other methods
  //

}
