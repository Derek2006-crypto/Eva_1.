/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva.class1_14.pkg0;

/**
 *
 * @author Derek
 */
public class Porductos {
    private String marca;
    private String nombre;
    private double precio;
    private int inventario;
   
     public void imprimirdatos(){
        System.out.println("Marca: " + marca);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Inventario: " + inventario);
    }
    
    public Porductos(String marca, String nombre, double precio, int inventario){
        this.marca = marca;
        this.nombre = nombre;
        this.precio = precio;
        this.inventario = inventario;
    }
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String valor){
        marca = valor;
    }
    public String setNombre(){
        return nombre;
    }
    public void getNombre(String valor){
        nombre = valor;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double valor){
        precio = valor;
    }
    
    public int getInventario(){
        return inventario;
    }
    public void setInventario(int valor){
        inventario = valor;
    }
    
    public void agregarInventario(int cantidad){
        this.inventario = cantidad;
    }
    public void retirarInventario(int cantidad){
        this.inventario = cantidad;
    }
}
