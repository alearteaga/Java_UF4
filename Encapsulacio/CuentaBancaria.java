public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    // lo que se a modificado setTitular de lo que pedia el primer ejercicio
    public void setTitular(String titular) {
        if (titular != null && !titular.isEmpty()) {
            this.titular = titular;
        } else {
            System.out.println("Error: El titular no puede estar vacío.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    // lo que se a modificado setSaldo de lo que pedia el primer ejercicio
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Error: El saldo no puede ser negativo.");
        }
    }
}
