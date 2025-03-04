/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica.pkg4_vehiculos;

import java.util.Scanner;
/**
 *
 * @author Derek
 */
public class Eva1_Practica4_Vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        vehiculos ve = new vehiculos();
        System.out.println("MARCA DEL VEHICULO: ");
        String cade = captu.nextLine();
        ve.set_Marca("Honda");
        
        System.out.println("MODELO DEL VEHICULO: ");
        cade =captu.nextLine();
        ve.set_Modelo("HONDA VRX");
        
        System.out.println("PRECIO: ");
        cade = captu.nextLine();
        double precio = Double.parseDouble(cade);
        ve.set_Precio(100000);
        
        System.out.println("AÑO DEL VEHICULO: ");
        cade = captu.nextLine();
        int year = Integer.parseInt(cade);
        ve.set_Year(2024);
        
        System.out.println("COLOR DEL VEHICULO: ");
        cade = captu.nextLine();
        ve.set_Color("Rojo");
        
        ve.Imprimir_Datos();
        
        
        
        
        
                
                
        
                
                
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
