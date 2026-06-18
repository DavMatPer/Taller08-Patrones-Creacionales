/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

import java.util.Map;
import javaapplication6.products.Producto;

/**
 *
 * @author david
 */
public abstract class FabricaProducto {
    public abstract Producto crearProducto(int id, String nombre, double precio, String categoria, Map<String, Object> atributos);
}
