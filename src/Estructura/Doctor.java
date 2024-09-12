
package Estructura;

import java.util.Date;

public class Doctor {
    // Atributos 
    private int dni;
    private String nombre;
    private int telefono;
    private String direccion;
    private Date fechaNacimiento;
    private int edad; 
    
    //Constructor vacio 
    public Doctor() {
    }
    
    // Constructor con parámetros
    public Doctor(int dni, String nombre, int telefono, String direccion, Date fechaNacimiento, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }
    
    // Get y Set
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Doctor{" + "dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad + '}';
    }
    
}
