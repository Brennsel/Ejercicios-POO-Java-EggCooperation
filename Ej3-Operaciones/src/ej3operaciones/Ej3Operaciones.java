package ej3operaciones;

import Datos.Operacion;

public class Ej3Operaciones {

    public static void main(String[] args) {

        Operacion op1 = new Operacion();
        double suma, resta, mult, division;

        op1 = op1.crearOperacion();

        suma = op1.suma();

        resta = op1.resta();

        mult = op1.multiplicar();

        division = op1.dividir();

        System.out.println("la suma es: " + suma);

        System.out.println("la resta es: " + resta);

        if (mult == 0) {
            System.out.println("Error");
        } else {
            System.out.println("la multiplicacion es: " + mult);
        }

        if (division == 0) {
            System.out.println("Error");
        } else {
            System.out.println("la division es: " + division);
        }

    }

}
