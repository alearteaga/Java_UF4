package Herencia;

public class Triangulo extends Figura {
    float base;
    float altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getArea() {
        return (base * altura) / 2;
    }

    public float getPerimetro() {
        return base + altura + (float) Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
}
