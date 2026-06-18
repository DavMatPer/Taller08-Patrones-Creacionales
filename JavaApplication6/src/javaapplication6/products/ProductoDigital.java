/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6.products;

/**
 *
 * @author david
 */
public class ProductoDigital extends Producto{
    
    private double tamanoArchivo;
    private String formato;

    public ProductoDigital(int id, String nombre, double precio, String categoria, double tamanoArchivo, String formato) {
        super(id, nombre, precio, categoria);
        this.tamanoArchivo = tamanoArchivo;
        this.formato = formato;
    }

    public double obtenerTamanoArchivo() {
        return tamanoArchivo;
    }

    public String obtenerFormato() {
        return formato;
    }

    @Override
    public String obtenerDetalles() {
        return "Producto Digital: " + nombre + " | Tamaño: " + tamanoArchivo + "MB | Formato: " + formato;
    }
}
