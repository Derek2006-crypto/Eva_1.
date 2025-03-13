/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva.class1_13sobrecarga_metodos;

/**
 *
 * @author Derek
 */
public class EVAClass1_13SOBRECARGA_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(sumar(5,3));
        System.out.println(sumar("HOLA","MUNDO"));
       sumar();
    }
    public static int sumar (int val1, int val2){
        return val1 + val2;
    }
    public static String sumar (String val1, String val2){
        return val1 + val2;
    }
    public static void sumar(){
        System.out.println("Nada de nada");
    }
}
