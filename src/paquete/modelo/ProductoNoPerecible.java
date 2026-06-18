/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.modelo;

/**
 *
 * @author goyon
 */
public class ProductoNoPerecible extends Producto {
    private String categoria;

    public ProductoNoPerecible(String nombre, int stock, double precio, String categoria) {
        super(nombre, stock, precio);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Producto No Perecible: " + getNombre() + " | Stock: " + getStock() + 
                           " | Precio: S/." + getPrecio() + " | Categoría: " + categoria);
    }
}