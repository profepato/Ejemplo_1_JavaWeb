package model;

public class Persona {
    private String DNI;
    private String nombre;

    public Persona() {
    }

    public Persona(String DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
