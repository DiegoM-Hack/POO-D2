import java.util.Scanner;

public class EquipoFutbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Jugador 1 - Datos quemados
        Jugador jugador1 = new Jugador("Carlos Gómez", "Delantero", 25, 9);

        // Jugador 2 - Datos quemados
        Jugador jugador2 = new Jugador("Luis Ramírez", "Portero", 30, 1);

        // Jugador 3 - Ingreso por teclado
        System.out.println("Ingrese los datos del Jugador 3:");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Posición: ");
        String posicion = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        System.out.print("Número de camiseta: ");
        int numero = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        Jugador jugador3 = new Jugador(nombre, posicion, edad, numero);

        // Mostrar la información de los tres jugadores
        System.out.println("\nInformación de los jugadores:");
        jugador1.mostrarInformacion();
        jugador2.mostrarInformacion();
        jugador3.mostrarInformacion();
 //ejemplo de commit
        sc.close();
    }
}


