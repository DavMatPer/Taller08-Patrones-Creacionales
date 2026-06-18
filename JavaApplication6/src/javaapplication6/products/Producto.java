/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javaapplication6.products;

/**
 *
 * @author david
 */
public abstract class Producto { // Interfaz para poder crear nuevos productos con distintas características.
    
    protected int id;
    protected String nombre;
    protected double precio;
    protected String categoria;

    public Producto(int id, String nombre, double precio, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public int obtenerId() {
        return id;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerPrecio() {
        return precio;
    }

    public String obtenerCategoria() {
        return categoria;
    }

    public abstract String obtenerDetalles();
    
}
