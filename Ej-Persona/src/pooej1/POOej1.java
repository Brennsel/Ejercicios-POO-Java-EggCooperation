package pooej1;

import Entidad.Persona;

public class POOej1 {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona("brenda","argañaraz",26); //objetos de la clase persona
        Persona persona2 = new Persona("gimena","dominguez",30);
        
        /*
        System.out.println(persona1.nombre); //accediendo al atributo nombre de la clase, poco seguro, no deberia saber los atributos y su comportamiento(metodos)
        persona1.nombre = "martin"; //modifico desde main atributos, poco seguro.
        System.out.println(persona1.nombre);
        */
        
        //encapsulamiento(private en los atributos) y en el main utilizando metodos (getter y setter)
        System.out.println(persona1.getNombre());
        persona1.setNombre("selene");
        System.out.println(persona1.getNombre());
        
    }
    
}
