/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_practica.pkg4_vehiculos;

/**
 *
 * @author Derek
 */
public class vehiculos {
    private String marca;
    private String modelo;
    private double precio;
    private int year;
    private String color;
    
    public String get_Marca(){
        return marca;
        
    }
    public void set_Marca(String valor){
        marca = valor;
    }
    public String get_Modelo(){
        return modelo;
        
    }
    public void set_Modelo(String valor){
        modelo = valor;
    }
    public int get_Year(){
        return year;
    }
    public void set_Year(int valor){
        year = valor;
    }
    public double get_Precio(){
        return precio;
        
    }
    public void set_Precio(double valor){
        precio = valor;
    }
    public String get_Color(){
        return color;
        
    }
   public void set_Color(String valor){
       color = valor;
   }
    
    public void Imprimir_Datos(){
        System.out.println("DATOS DEL VEHICULO");
        System.out.println("MARCA: "+ marca);
        System.out.println("MODELO: "+ modelo);
        System.out.println("AÑO: "+ year);
        System.out.println("COLOR: "+ color);
        System.out.println("PRECIO. "+ precio);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
