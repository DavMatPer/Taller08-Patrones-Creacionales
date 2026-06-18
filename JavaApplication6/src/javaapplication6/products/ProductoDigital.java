/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6.products;

/**
 *
 * @author david
 */
public class ProductoDigital implements Producto{
    
    float size;
    String formato;

    public ProductoDigital() {
    }
    
    

    public ProductoDigital(float size, String formato) {
        this.size = size;
        this.formato = formato;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
    
    
    
}
