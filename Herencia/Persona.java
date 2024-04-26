package herencia;

public class Persona {
    String nombre;
    String apellidos;
    int edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void presentarse() {
        System.out.println("Hola, mi nombre es " + nombre + " " + apellidos + " y tengo " + edad + " años.");
    }
}
