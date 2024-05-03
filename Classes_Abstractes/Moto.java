package Classes_Abstractes;

public class Moto extends Vehiculo {
    
    public Moto(double velocidad, double frenar, double acelerar) {
        super(velocidad, frenar, acelerar);
    }

    @Override
    public double acelerar() {
        return velocidad - acelerar;
    }

    @Override
    public double frenar() {
        return velocidad - frenar;
    } 

} 
