/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

import javaapplication6.products.Producto;
import javaapplication6.products.ProductoDigital;

/**
 *
 * @author david
 */
public class CreadorProductoDigital extends CreadorProducto{
    
    public Producto crearProducto() {
        return new ProductoDigital();
    }
}
