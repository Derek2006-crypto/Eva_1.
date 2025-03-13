/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva.class1_11.metodos.estaticos;

/**
 *
 * @author Derek
 */
public class EVAClass1_11MetodosEstaticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      double valorAleatorio = Math.random();
        TEMPERATURAS temp = new TEMPERATURAS();
        System.out.println(temp.convertirFaC(100));
        System.out.println(temp.convertirCaF(100));
        System.out.println(temp.convertirCaK(100));
        System.out.println(temp.convertirKaC(100));
        System.out.println(temp.convertirFaK(100));
    }
    
        
}


        
    