/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

import java.util.Map;
import javaapplication6.products.Producto;
import javaapplication6.products.ProductoDigital;

/**
 *
 * @author david
 */
public class FabricaProductoDigital extends FabricaProducto{
    
    @Override
    public Producto crearProducto(int id, String nombre, double precio, String categoria, Map<String, Object> atributos) {
        // Extraemos los atributos específicos requeridos para el producto digital
        double tamanoArchivo = (double) atributos.get("tamanoArchivo");
        String formato = (String) atributos.get("formato");
        
        return new ProductoDigital(id, nombre, precio, categoria, tamanoArchivo, formato);
    }
}
