package Classes_Abstractes;

public class Coche extends Vehiculo {
    
    // Constructor
    public Coche(double velocidad, double frenar, double acelerar) {
        super(velocidad, frenar, acelerar);
    }

    @Override
    public double acelerar() {
        return velocidad + acelerar; // Se incrementa la velocidad
    }

    @Override
    public double frenar() {
        return velocidad - frenar; // Se reduce la velocidad
    } 
}
