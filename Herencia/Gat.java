package Herencia;

public class Gat extends Animal {
    // Constructor
    public Gat(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerRuido() {
        System.out.println("Miau");
    }
}
