package Herencia;

public class Coche extends Vehiculo {
    int ruedas = 4;

    // Constructor
    public Coche(String marca, String modelo, int anio, int ruedas) {
        super(marca, modelo, anio);
        this.ruedas = ruedas;
    }

}
