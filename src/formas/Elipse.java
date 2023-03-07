package formas;

/**
 * Class Elipse
 */
public class Elipse extends Conica {

  //
  // Fields
  //

  private double ejeMayor;
  /**
   * 		
   */
  private double ejeMenor;
  
  //
  // Constructors
  //
  public Elipse () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of ejeMayor
   * @param newVar the new value of ejeMayor
   */
  public void setEjeMayor (double newVar) {
    ejeMayor = newVar;
  }

  /**
   * Get the value of ejeMayor
   * @return the value of ejeMayor
   */
  public double getEjeMayor () {
    return ejeMayor;
  }

  /**
   * Set the value of ejeMenor
   * 
   * @param newVar the new value of ejeMenor
   */
  public void setEjeMenor (double newVar) {
    ejeMenor = newVar;
  }

  /**
   * Get the value of ejeMenor
   * 
   * @return the value of ejeMenor
   */
  public double getEjeMenor () {
    return ejeMenor;
  }

  //
  // Other methods
  //

}
