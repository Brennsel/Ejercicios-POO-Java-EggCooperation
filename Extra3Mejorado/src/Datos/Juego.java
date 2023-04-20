package Datos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author brenn
 */
public class Juego {
    
    private String jugador1;
    private String jugador2;
    private int numMisterioso;
    private int numPropuesto;
    private int intentos;
    private int ganador1;
    private int ganador2;


    // metodo constructor vacio
    public Juego() {
    }
    
    //metodo constructor con parametros

    public Juego(String jugador1, String jugador2, int numMisterioso, int numPropuesto, int intentos, int ganador1, int ganador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.numMisterioso = numMisterioso;
        this.numPropuesto = numPropuesto;
        this.intentos = intentos;
        this.ganador1 = ganador1=0;
        this.ganador2 = ganador2=0;
    }


    //metodos getters y setters

    public String getJugador1() {
        return jugador1;
    }

    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

    public int getNumMisterioso() {
        return numMisterioso;
    }

    public void setNumMisterioso(int numMisterioso) {
        this.numMisterioso = numMisterioso;
    }

    public int getNumPropuesto() {
        return numPropuesto;
    }

    public void setNumPropuesto(int numPropuesto) {
        this.numPropuesto = numPropuesto;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getGanador1() {
        return ganador1;
    }

    public void setGanador1(int ganador1) {
        this.ganador1 = ganador1;
    }

    public int getGanador2() {
        return ganador2;
    }

    public void setGanador2(int ganador2) {
        this.ganador2 = ganador2;
    }
    public void iniciarJuego(){
        Scanner leer = new Scanner(System.in);

        this.jugador1 = JOptionPane.showInputDialog("Ingrese el nombre del primer jugador");
        this.jugador2 = JOptionPane.showInputDialog("Ingrese el nombre del segundo jugador");
        String respuesta = JOptionPane.showInputDialog("quieren jugar a la adivinanza de números?");

        while( respuesta.equalsIgnoreCase("si")){


        this.numMisterioso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número a adivinar que sea mayor a 0"));
        while (this.numMisterioso <=0){
            this.numMisterioso = Integer.parseInt(JOptionPane.showInputDialog("El número ingresado no cumple los requisitos, ingrese otro número"));
        }

        this.intentos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de intentos posibles"));
        while (this.intentos <=1){
            this.intentos = Integer.parseInt(JOptionPane.showInputDialog("El número de intentos tiene que ser mayor a 1, ingrese nuevamente"));
        }
            System.out.println(this.jugador2 +"¿Cuál es el número que eligió " + this.jugador1 + "?");
            this.numPropuesto =Integer.parseInt(JOptionPane.showInputDialog(this.jugador2 +"¿Cuál es el número que eligió " + this.jugador1 + "?"));
            this.intentos--;
        do {
            if (this.numPropuesto == this.numMisterioso){
                System.out.println("Felicitaciones! adivinaste el número!");
                ganador2++;
                break;
            } else if (this.numPropuesto>this.numMisterioso) {
                numPropuesto = Integer.parseInt(JOptionPane.showInputDialog("El número que tenés que adivinar es mas chico, ingresa otro"));
                this.intentos--;

            } else if (this.numPropuesto < this.numMisterioso){
                numPropuesto = Integer.parseInt(JOptionPane.showInputDialog("El número que tenés que adivinar es mas grande, ingresa otro"));
                this.intentos--;
            }

        }while(this.intentos > 0 );
        this.ganador1 ++;
        if (this.ganador2>0){
            JOptionPane.showMessageDialog(null, this.jugador2 + " adivinó el número en " + this.intentos + " intentos y ganó esta partida");

        }else {
            System.out.println("Se terminaron los intentos, " +this.jugador1+ " ganó esta partida");
        }
            System.out.println(" Quieren seguir jugando?");
        respuesta = leer.next();
        if (respuesta.equalsIgnoreCase("no")){
            System.out.println( this.jugador2 + " ganó " + this.ganador2 + " veces.");
            System.out.println( this.jugador1 + " ganó " + this.ganador1 + " veces.");
        }


        }

    }
}
