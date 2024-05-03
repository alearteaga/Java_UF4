package Herencia;

public class Moto extends Vehiculo {
    int intermitentes;

    public Moto(String marca, String modelo, int anio, int intermitentes) {
        super(marca, modelo, anio);
        this.intermitentes = 2;
    }
}
