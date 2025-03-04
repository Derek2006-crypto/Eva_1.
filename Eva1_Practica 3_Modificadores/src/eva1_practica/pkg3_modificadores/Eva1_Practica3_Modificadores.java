/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica.pkg3_modificadores;

/**
 *
 * @author Derek
 */
public class Eva1_Practica3_Modificadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona pers = new Persona();
       pers.set_Nombre("Ramon");
       pers.set_Apellido("Valdez");
       pers.set_Edad(30);
       pers.set_Genero("Hombre");
       pers.set_Curp("BDBDT34BDdb");
       System.out.println("Nombre: "+ pers.get_Nombre());
       System.out.println("Apellido: "+ pers.get_Apellido());
       System.out.println("Edad: "+ pers.get_Edad());
       System.out.println("Genero: "+ pers.get_Genero());
       System.out.println("Curp: "+ pers.get_Curp());
       
       
       
       
       
       
    }
    
}
