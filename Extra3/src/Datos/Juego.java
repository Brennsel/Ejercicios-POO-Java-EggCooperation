/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números. 
El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento. 
El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. 
Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
 */
package Datos;

import java.util.Scanner;

public class Juego {
    
    private int numeroSecreto;

    public Juego() {
    }

    public Juego(int numeroSecreto) {
        this.numeroSecreto = numeroSecreto;
    }

    public int getNumeroSecreto() {
        return numeroSecreto;
    }

    public void setNumeroSecreto(int numeroSecreto) {
        this.numeroSecreto = numeroSecreto;
    }
    
    public void iniciarJuego(){
        
        Scanner leer = new Scanner(System.in);
        int numeroIngresado, intento=3;
        boolean acerto=false;
        
        System.out.print("JUGADOR 1: Ingrese el numero a adivinar (entre 1 y 10): ");
        
       //do{ 
       
        numeroSecreto= leer.nextInt();
        
        /*if(numeroSecreto>0 || numeroSecreto>10){
            System.out.println("Numero invalido. ingrese nuevamente");
        }
           
        }while(numeroSecreto>0 || numeroSecreto<10);*/
        
        System.out.println("JUGADOR 2: tenes 3 intentos para advinar el numero");
        System.out.print("Ingrese un numero ");
        
        while(acerto==false){
            
            System.out.println("Intento: " +intento);
            
            numeroIngresado=leer.nextInt();
            intento--;
            
            if(numeroSecreto<numeroIngresado){
                 System.out.println("Mas bajo");
            }
            
            if(numeroSecreto>numeroIngresado){
                System.out.println("Mas alto");
            }
            
            if(numeroSecreto==numeroIngresado){
                System.out.println("Felicitaciones. Gano!");
                acerto=true;
                break;
            }
            
            if(intento==0){
                
                System.out.println("Se quedo sin intentos");
                break;
                
            }
            
            System.out.println("===============================");
           
        }
        
    }
    
}
