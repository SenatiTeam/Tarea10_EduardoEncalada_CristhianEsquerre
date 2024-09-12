
package Estructura;

public class Paciente {
    // Atributos 
    private int dnio;
    private String nombre;
    private int edad;
    private String color;
    private String raza;
    private float peso;
    
    // Constructor vacio 
    public Paciente() {
    }
    
    // Constructor con parámetros 
    public Paciente(int dnio, String nombre, int edad, String color, String raza, float peso) {
        this.dnio = dnio;
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.raza = raza;
        this.peso = peso;
    }
    
    // Get y Set
    public int getDnio() {
        return dnio;
    }

    public void setDnio(int dnio) {
        this.dnio = dnio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Paciente{" + "dnio=" + dnio + ", nombre=" + nombre + ", edad=" + edad + ", color=" + color + ", raza=" + raza + ", peso=" + peso + '}';
    }
    
}
