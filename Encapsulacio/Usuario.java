public class Usuario {
    private String nombre;
    private String email;
    private String contrasena;

    public Usuario(String nombre, String email, String contrasena) {
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        if (validarContrasena(contrasena)) {
            this.contrasena = contrasena;
        } else {
            System.out.println("Error: La nueva contraseña no cumple con los criterios.");
        }
    }

    private boolean validarContrasena(String contrasena) {
        // Implementa la lógica de validación de contraseña
        // Por ejemplo, longitud mínima, caracteres especiales, etc.
        return contrasena.length() >= 8 && contrasena.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");
    }
}
