/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fichas_venta;

/**
 *
 * @author Derek
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private double rfc;
    private boolean persona;
    private int edad;
    private int telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getRfc() {
        return rfc;
    }

    public void setRfc(double rfc) {
        this.rfc = rfc;
    }

    public boolean isPersona() {
        return persona;
    }

    public void setPersona(boolean persona) {
        this.persona = persona;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public void Imprimir_Cliente(){
        System.out.println("Datos del Cliente");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellido: "+ apellido);
        System.out.println("RFC: "+ rfc);
        if(persona){
            System.out.println("ES PERSONA FISICA");
        }else{
            System.out.println("ES PERSONA MORAL");
        }
                System.out.println("Edad: "+ edad);
                System.out.println("Telefono: "+ telefono);
    }

}
