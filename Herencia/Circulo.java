package herencia;

public class Circulo extends Figura {
    float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getArea() {
        return (float) (Math.PI * Math.pow(radio, 2));
    }

    public float getPerimetro() {
        return (float) (2 * Math.PI * radio);
    }
}
