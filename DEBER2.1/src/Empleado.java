public class Empleado {
    String nombre;
    String cargo;
    double salario;
    String fechaIngreso;

    // Constructor 
    public Empleado() {}

    // Métod para mostrar la información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: $" + salario);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
        System.out.println("------------------------------");
    }
}
