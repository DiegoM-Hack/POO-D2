import java.util.Scanner;

class Jugador {
    // Atributos
    String nombre;
    String posicion;
    int edad;
    int numeroCamiseta;

    // Constructor
    public Jugador(String nombre, String posicion, int edad, int numeroCamiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.numeroCamiseta = numeroCamiseta;
    }

    // Método para mostrar la información del jugador
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Posición: " + posicion);
        System.out.println("Edad: " + edad);
        System.out.println("Número de camiseta: " + numeroCamiseta);
        System.out.println("------------------------------");
    }
}
