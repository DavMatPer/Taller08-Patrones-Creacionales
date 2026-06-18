/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6.products;

/**
 *
 * @author david
 */
public class ProductoFísico implements Producto{
    float peso;
    float dimensiones;

    public ProductoFísico(float peso, float dimensiones) {
        this.peso = peso;
        this.dimensiones = dimensiones;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(float dimensiones) {
        this.dimensiones = dimensiones;
    }
    
    
}
