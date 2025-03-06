/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica.pkg7_ventas;
import java.util.Scanner;
import Fichas_venta.Producto;
import Fichas_venta.Cliente;
/**
 *
 * @author Derek
 */
public class Eva1_Practica7_Ventas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        Producto pr = new Producto();
        Cliente cl = new Cliente();
        System.out.println("DATOS DEL INVENTARIO");
        pr.setMarca("Coca-Cola");
        pr.setNombre("Coca-Cola");
        pr.setPrecio(15);
        pr.setInventario(300);
        pr.setClave(12344509);
        pr.Imprimir_Producto();
        
        cl.setNombre("Pedro");
        cl.setApellido("Piedra");
        cl.setEdad(15);
        cl.setPersona(true);
        cl.setRfc(345600);
        cl.Imprimir_Cliente();
        
          
        
    }
    
}
