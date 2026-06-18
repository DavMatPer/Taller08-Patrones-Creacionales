/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6.singleton;

/**
 *
 * @author david
 */
public class GestorBaseDatos {
    
    private static GestorBaseDatos instance;
    private Connection conexion;
    private String url;
    private String usuario;
    private String contrasena;
    
    private GestorBaseDatos() {
        
    }
    
    public static GestorBaseDatos getInstance() {
        if ( instance == null) instance = new GestorBaseDatos(); // Crear Instancia
    
        return instance;
    }
    
    public static boolean query ( String query) {
        if (query == null) return false;
        
        return true;
    }

    public Connection getConexion() {
        return conexion;
    }
    
    public void closeConexion( Connection conexion) {
        
    }
}
