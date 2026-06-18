/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6.products;

/**
 *
 * @author david
 */
public class ProductoFísico extends Producto{
    private double peso;
    private String dimensiones;

    public ProductoFísico(int id,double peso,  String nombre, double precio, String categoria, String dimensiones) {
        super(id, nombre, precio, categoria);
        this.peso = peso;
        this.dimensiones = dimensiones;
    }

    

    public double obtenerPeso() {
        return peso;
    }

    public String obtenerDimensiones() {
        return dimensiones;
    }

    @Override
    public String obtenerDetalles() {
        return "Producto Físico: " + nombre + " | Peso: " + peso + "kg | Dimensiones: " + dimensiones;
    }
    
}
