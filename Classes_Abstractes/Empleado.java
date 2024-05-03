package Classes_Abstractes;

abstract class Empleado {
    public abstract double calcularSueldo();
    public abstract void imprimirDetalles();
}

class EmpleadoFijo extends Empleado {
    private String nombre;
    private double sueldoFijo;

    public EmpleadoFijo(String nombre, double sueldoFijo) {
        this.nombre = nombre;
        this.sueldoFijo = sueldoFijo;
    }

    @Override
    public double calcularSueldo() {
        return sueldoFijo;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo: " + sueldoFijo);
    }
}

class EmpleadoComision extends Empleado {
    private String nombre;
    private double sueldoBase;

    public EmpleadoComision(String nombre, double sueldoBase, double porcentajeComision, double ventas) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo base: " + sueldoBase);
    }
}
