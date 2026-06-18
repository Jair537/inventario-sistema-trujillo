/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.modelo;

/**
 *
 * @author goyon
 */
public class ProductoPerecible extends Producto {
    private String fechaVencimiento;

    public ProductoPerecible(String nombre, int stock, double precio, String fechaVencimiento) {
        super(nombre, stock, precio); 
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Producto Perecible: " + getNombre() + " | Stock: " + getStock() + 
                           " | Precio: S/." + getPrecio() + " | Vence: " + fechaVencimiento);
    }
}
