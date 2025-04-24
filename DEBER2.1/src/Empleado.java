public class Empleado {
    String nombre;
    String cargo;
    double salario;
    String fechaIngreso;

    // Constructor (opcional, se puede usar sin constructor también)
    public Empleado() {}

    // Método para mostrar la información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: $" + salario);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
        System.out.println("------------------------------");
    }
}
