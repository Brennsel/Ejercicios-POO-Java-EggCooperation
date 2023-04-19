/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. 
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
package Datos;

import java.util.Scanner;


public class Cuenta {
    
    private float saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(float saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void retirarDinero(){
        
        Scanner leer = new Scanner(System.in);
        float extraccion;
        
        System.out.println("Cuanto desea retirar?: ");
        extraccion=leer.nextFloat();
        
        while(extraccion>saldo){
            
            System.out.println("Saldo insuficiente. Ingrese nuevamente el importe a retirar: ");
            extraccion=leer.nextFloat(); 
        }
  
        System.out.println("Su nuevo saldo es: " +(saldo-extraccion));
    }
}    
    
   
 