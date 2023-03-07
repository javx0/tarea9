import formas.Circulo;
import formas.Cuadrado;
import formas.Elipse;
import formas.Rectangulo;


public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Cuadrado cuadrado = new Cuadrado();
        Elipse elipse = new Elipse();
        Rectangulo rectangulo = new Rectangulo();

        circulo.setColor("azul");       //Se demuestra que circulo hereda color de conica y que conica hereda color de forma
        System.out.println(circulo.getColor());
    }
}
