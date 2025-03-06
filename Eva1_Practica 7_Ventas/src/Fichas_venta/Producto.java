/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fichas_venta;

/**
 *
 * @author Derek
 */
public class Producto {
    private String nombre;
    private String marca;
    private double precio;
    private int clave;
    private int inventario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }
    
    public void Imprimir_Producto(){
        System.out.println("Datos del producto");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Marca: "+ marca);
        System.out.println("Precio: "+ precio);
        System.out.println("Clave: "+ clave);
        System.out.println("Inventario: "+inventario);
                
    }
}
