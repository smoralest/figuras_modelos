package figuras;

import figura.logica.Circulo;
import figura.logica.Cuadrado;
import figura.logica.Elipse;
import figura.logica.Figura;
import figura.logica.Rectangulo;
import figura.logica.Punto;
import figura.logica.TrianguloRectangulo;
import java.util.Scanner;

public class Figuras {

    public static void main(String[] args) {
        System.out.println("Seleccione la figura");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Triangulo Rectangulo");
        System.out.println("4. Circulo");
        System.out.println("5. Elipse");
        Scanner sc = new Scanner(System.in);
        int opc = sc.nextInt();
        Figura f;
        Punto origen = new Punto();
        Punto fin = new Punto();
        switch (opc) {
            case 1:
                f = new Cuadrado();
                origen.setX(0);
                origen.setY(0);
                fin.setX(5);
                fin.setY(0);
                mostrar(f, origen, fin);
                break;
            case 2:
                f = new Rectangulo();
                origen.setX(0);
                origen.setY(5);
                fin.setX(10);
                fin.setY(0);
                mostrar(f, origen, fin);
                break;
            case 3:
                f = new TrianguloRectangulo();
                origen.setX(0);
                origen.setY(5);
                fin.setX(10);
                fin.setY(0);
                mostrar(f, origen, fin);
                break;
            case 4:
                f = new Circulo();
                origen.setX(0);
                origen.setY(0);
                fin.setX(0);
                fin.setY(8);
                mostrar(f, origen, fin);
                break;
            case 5:
                f = new Elipse();
                origen.setX(0);
                origen.setY(2);
                fin.setX(3);
                fin.setY(0);
                mostrar(f, origen, fin);
                break;
            default:
                System.out.println("Opcion no valida");
        }

    }

    public static void mostrar(Figura f, Punto origen, Punto fin) {
        f.setOrigen(origen);
        f.setFin(fin);
        f.calcularArea();
        f.calcularPerimetro();
        System.out.println("area = " + f.getArea());
        System.out.println("perimetro = " + f.getPerimetro());
    }
}
