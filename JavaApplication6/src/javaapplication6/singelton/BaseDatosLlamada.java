/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6.singelton;

/**
 *
 * @author david
 */
public class BaseDatosLlamada {
    
    private static BaseDatosLlamada instance;
    
    private BaseDatosLlamada() {
        
    }
    
    public static BaseDatosLlamada getInstance() {
        if ( instance == null) instance = new BaseDatosLlamada(); // Crear Instancia
    
        return instance;
    }
    
    public static boolean query ( String query) {
        if (query == null) return false;
        
        return true;
    }
}
