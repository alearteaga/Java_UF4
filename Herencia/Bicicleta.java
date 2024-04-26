package herencia;

public class Bicicleta extends Vehiculo {
    int frenos;

    public Bicicleta(String marca, String modelo, int anio, int frenos) {
        super(marca, modelo, anio);
        this.frenos = frenos;
    }

    // Buuum
}
