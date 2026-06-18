/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

import java.util.HashMap;
import java.util.Map;
import javaapplication6.products.Producto;

/**
 *
 * @author david
 */
public class RegistroFabricaProductos {
    private Map<String, FabricaProducto> fabricas;

    public RegistroFabricaProductos() {
        this.fabricas = new HashMap<>();
    }

    public void registrarFabrica(String tipo, FabricaProducto fabrica) {
        this.fabricas.put(tipo, fabrica);
    }

    public FabricaProducto obtenerFabrica(String tipo) {
        return this.fabricas.get(tipo);
    }
}
