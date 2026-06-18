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

    public Producto buscarProducto(String nombre) {
        for (Producto p : listaProductos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null; 
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
}