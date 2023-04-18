/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
A continuación, se deben crear los siguientes métodos:
a-Método constructor que inicialice el radio pasado como parámetro.
b-Métodos get y set para el atributo radio de la clase Circunferencia.
c-Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
d-Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
e-Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 */
package Datos;

import java.util.Scanner;

public class Circunferencia {
    
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
 
    public Circunferencia crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el radio: ");
        radio=leer.nextDouble();
                
        return new Circunferencia(radio);
    }
    
    public void area(){
        
        double area;
        
        area = Math.pow(Math.PI*radio, 2);
        
        System.out.println("El area es: " +area);
        
    } 
    
    public void perimetro(){
        
        double perimetro;
        
        perimetro = 2*Math.PI*radio;  
        
        System.out.println("El perimetro es: " +perimetro);
    }
    
    
    
}
