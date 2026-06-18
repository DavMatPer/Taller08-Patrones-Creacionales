/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

import java.util.Map;
import javaapplication6.products.Producto;
import javaapplication6.products.ProductoFísico;

/**
 *
 * @author david
 */
public class FabricaProductoFisico extends FabricaProducto{
    
    @Override
    public Producto crearProducto(int id, String nombre, double precio, String categoria, Map<String, Object> atributos) {
        // Extraemos los atributos específicos requeridos para el producto físico
        double peso = (double) atributos.get("peso");
        String dimensiones = (String) atributos.get("dimensiones");
        
        return new ProductoFísico(id, precio, nombre,  peso, categoria, dimensiones);
    }
}
