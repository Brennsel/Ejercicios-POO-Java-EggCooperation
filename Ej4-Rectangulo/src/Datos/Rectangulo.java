/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. 
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Datos;

import java.util.Scanner;

public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Rectangulo crearRectangulo() {

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        base = leer.nextDouble();

        System.out.print("Ingrese la altura: ");
        altura = leer.nextDouble();

        return new Rectangulo(base, altura);

    }

    public void areaRectangulo() {

        System.out.println("el area es: " + (base * altura));

    }

    public void perimetroRectangulo() {

        System.out.println("el perimetro es: " + ((base + altura) * 2));
    }

    public void dibujoRectangulo() {

        for (int i = 0; i < (int) altura; i++) {
            for (int j = 0; j < (int) base; j++) {

                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }

    }

}
