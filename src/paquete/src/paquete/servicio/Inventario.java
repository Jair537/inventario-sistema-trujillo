/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.servicio;
import paquete.modelo.Producto;
import java.util.ArrayList;
/**
 *
 * @author goyon
 */
public class Inventario {
    private ArrayList<Producto> listaProductos;

    public Inventario() {
        this.listaProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        listaProductos.add(p);
    }

    public paquete.modelo.Producto buscarProducto(String nombre) {
    if (listaProductos == null || nombre == null) {
        return null;
    }
    
    // Recorremos la lista buscando una coincidencia inteligente
    for (paquete.modelo.Producto p : listaProductos) {
        // .trim() quita espacios y .equalsIgnoreCase ignora mayúsculas/minúsculas
        if (p.getNombre().trim().equalsIgnoreCase(nombre.trim())) {
            return p; // ¡Lo encontró! Devuelve el producto existente
        }
    }
    return null; // No existe
}

    public void actualizarStock(String nombre, int nuevaCantidad) {
        Producto p = buscarProducto(nombre);
        if (p != null) {
            p.setStock(nuevaCantidad);
        }
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }
    public String listarProductos() {
    // Si la lista está vacía, devolvemos un mensaje directo
    if (listaProductos == null || listaProductos.isEmpty()) {
        return "No hay productos registrados en el inventario.";
    }
    
    StringBuilder sb = new StringBuilder();
    // Recorremos cada producto de tu lista
    for (paquete.modelo.Producto p : listaProductos) {
        sb.append("• ").append(p.getNombre())
          .append(" | Stock: ").append(p.getStock())
          .append(" | Precio: S/. ").append(p.getPrecio())
          .append("\n");
    }
    return sb.toString();
}
    
}