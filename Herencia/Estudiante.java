package Herencia;

public class Estudiante extends Persona {
    String curso;
    float notaMedia;

    public Estudiante(String nombre, String apellidos, int edad, String curso, float notaMedia) {
        super(nombre, apellidos, edad);
        this.curso = curso;
        this.notaMedia = notaMedia;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    public void estudiar() {
        System.out.println("Estudiando...");
    }
}
