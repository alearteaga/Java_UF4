public class Coche {
    private String marca;
    private String modelo;
    private float kilometraje;

    public Coche(String marca, String modelo, float kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(float kilometraje) {
        if (kilometraje > this.kilometraje) {
            this.kilometraje = kilometraje;
        } else {
            System.out.println("Error: El kilometraje nuevo debe ser mayor que el actual.");
        }
    }
}
