package Classes_Abstractes;

abstract class Vehiculo {
    double velocidad;
    double frenar;
    double acelerar;

    public Vehiculo(double velocidad, double frenar, double acelerar) {
        this.velocidad = velocidad;
        this.frenar = frenar;
        this.acelerar = acelerar;
    }

    public abstract double acelerar(); // No puede tener contenido.
    public abstract double frenar();
}
