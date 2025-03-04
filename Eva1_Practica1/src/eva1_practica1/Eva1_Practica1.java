/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica1;

/**
 *
 * @author Derek
 */
public class Eva1_Practica1 {

   
    public static void main(String[] args) {
        Persona perso1;
        perso1 = new Persona();
        perso1.edad = 10;
        perso1.genero = "Hombre";
        perso1.nombre = "bhanabra";
        perso1.imprimirDatos();
        System.out.println(perso1);
    }
}

class Persona {
    String nombre;
    int edad;
    String genero;
    void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
    }
    














}
    

