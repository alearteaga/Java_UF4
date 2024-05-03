package Ultimo_ejercicio;

public class Empleado {
    private double salario;
    private DatosPersonales datosPersonales;

    public Empleado(double salario, DatosPersonales datosPersonales) {
        this.salario = salario;
        this.datosPersonales = datosPersonales;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        // Aquí podrías agregar lógica adicional según las políticas de ajuste de
        // salario
        this.salario = salario;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }

    public void setDatosPersonales(DatosPersonales datosPersonales) {
        // Aquí podrías agregar lógica adicional según las políticas de actualización de
        // datos personales
        this.datosPersonales = datosPersonales;
    }
}
