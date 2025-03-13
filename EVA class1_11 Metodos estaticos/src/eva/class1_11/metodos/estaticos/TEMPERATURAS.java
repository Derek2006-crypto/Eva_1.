/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva.class1_11.metodos.estaticos;

/**
 *
 * @author Derek
 */
public class TEMPERATURAS {
    public static double convertirFaC(double fa){
        return fa - 32/ 1.8;
        
    }
    public static double convertirCaF(double ce){
        return ce * 9/5 + 32;
        
    }
    public static double convertirCaK(double ce){
        return ce + 273.15;
        
    }
    public static double convertirKaC(double ka){
        return ka - 273.15;
        
    }
    public static double convertirFaK(double fa){
        return fa - 32 * 5/9 + 273.15;
    }
    
    
}
    

