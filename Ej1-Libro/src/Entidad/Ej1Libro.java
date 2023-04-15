package Entidad;

/*
Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
 */

public class Ej1Libro {

    public static void main(String[] args) {
        
        Libro ingreso1 = new Libro();

       Libro.cargarLibro(ingreso1); //estatico se puede llamar a traves de la clase.
       Libro.mostrarLibro(ingreso1); // si no es estatico debo crear una instancia y luego llamar al metodo.
       
    }
}
