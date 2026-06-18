/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.modelo;

/**
 *
 * @author goyon
 */
public abstract class Producto {
    // Atributos privados para cumplir con el principio de Encapsulamiento
    private String nombre;
    private int stock;
    private double price; // Definido como 'price' en el diagrama original

    // Constructor para inicializar los atributos al crear un producto
    public Producto(String nombre, int stock, double precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.price = precio;
    }

    // Métodos Getter y Setter (Encapsulamiento)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return price;
    }

    public void setPrecio(double precio) {
        this.price = precio;
    }

    // Método para incrementar el stock disponible (Operación del diagrama)
    public void agregarStock(int cantidad) {
        if (cantidad > 0) {
            this.stock += cantidad;
        }
    }

    // Método para disminuir el stock cuando se realiza una venta (Operación del diagrama)
    public void reducirStock(int cantidad) {
        if (cantidad > 0 && this.stock >= cantidad) {
            this.stock -= cantidad;
        }
    }

    // Método abstracto: obliga a las clases hijas a definir cómo mostrar su información (Polimorfismo)
    public abstract void mostrarInformacion();
}
