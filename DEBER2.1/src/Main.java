import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creamos arreglo para 3 empleados
        Empleado[] empleados = new Empleado[3];

        // Recolectamos datos de cada empleado
        for (int i = 0; i < empleados.length; i++) {
            empleados[i] = new Empleado();

            System.out.println("Ingrese los datos del empleado " + (i + 1) + ":");

            System.out.print("Nombre: ");
            empleados[i].nombre = sc.nextLine(); // Pide que ingrese una linea de texto

            System.out.print("Cargo: ");
            empleados[i].cargo = sc.nextLine(); // Pide que ingrese una linea de texto

            System.out.print("Salario: ");
            empleados[i].salario = sc.nextDouble(); // Pide que ingresee un numero double
            sc.nextLine(); // Limpiar buffer

            System.out.print("Fecha de ingreso (ej. 2023-04-01): ");
            empleados[i].fechaIngreso = sc.nextLine(); // Pide que ingrese una linea de texto

            System.out.println();
        }

        // Mostrar la información de los empleados
        System.out.println("Información de los empleados:");
        for (Empleado emp : empleados) { //Ciclo for
            emp.mostrarInformacion();
        }
   //este es ub ejemplo de commit
        sc.close();
    }
}
