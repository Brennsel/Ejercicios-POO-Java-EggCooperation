/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. 
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
package extra4;

import Datos.Cuenta;

public class Extra4 {
    
    public static void main(String[] args) {
      
        Cuenta c1 = new Cuenta(5000,"Juan");
        
        c1.retirarDinero();

    }
    
}
