package extra2;

import Datos.Puntos;

public class Extra2 {

    public static void main(String[] args) {
     
        Puntos p1 = new Puntos();
        float distancia;
        
        p1.crearPuntos(); // o p1=p1.crearPuntos(); ???
        
        distancia = p1.distanciaPuntos();
        
        System.out.println("La distancia entre los puntos es: " +distancia);
    }
    
}
