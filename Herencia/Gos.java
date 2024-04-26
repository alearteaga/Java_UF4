package Herencia;

public class Gos extends Animal {
    // Constructor
    public Gos(String nombre, int edad) {
        super(nombre,edad);
    }

    @Override
    public void hacerRuido() {
        System.out.println("Grrr");
    }
}
