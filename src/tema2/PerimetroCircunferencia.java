package tema2;

/**
 * PerimetroCircunferencia
 */
public class PerimetroCircunferencia {

    public static void main(String[] args) {

        final double PI = 3.1415926536;
        double radio = 25.0, perimetro;
        perimetro = 2.0*PI*radio;
        System.out.print("El perimetro de la circunferencia de radio ");
        System.out.println(radio);
        System.out.print(" es ");
        System.out.print(perimetro);
        }
     }