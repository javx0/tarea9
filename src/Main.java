import formas.Circulo;
import formas.Cuadrado;
import formas.Elipse;
import formas.Rectangulo;
import personas.Persona;
import personas.PuestoTrabajo;


public class Main {
    /*
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Cuadrado cuadrado = new Cuadrado();
        Elipse elipse = new Elipse();
        Rectangulo rectangulo = new Rectangulo();

        circulo.setColor("azul");       //Se demuestra que circulo hereda color de conica y que conica hereda color de forma
        System.out.println(circulo.getColor());
    }
    */

    public static void main(String[] args) {
        Persona persona1 = new Persona("pepe","sanchez","sanchez", "2000-00-00", 'M',12);
        PuestoTrabajo puesto1 = new PuestoTrabajo("programador", "2010-00-00","2012-00-00",1000, persona1, "programadores inc");
        PuestoTrabajo puesto2 = new PuestoTrabajo("diseñador grafico", "2012-00-00","2014-00-00",1300, persona1, "programadores inc");
        System.out.println(puesto1);
        System.out.println(puesto2);
    }
}
