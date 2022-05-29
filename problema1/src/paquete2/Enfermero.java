/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Edgar Espinoza
 */
public class Enfermero {
    
    private String nombreE;
    private String tipoC;
    private double sueldo;
    
    public Enfermero(String nom, String tipo, double suel){
        
        nombreE = nom;
        tipoC = tipo;
        sueldo = suel;
        
    }
    
    public void establecerNombreE(String nomE){
        
        nombreE = nomE;
    
    }
    
    public void establecerTipo(String tipo){
        
        tipoC = tipo;
    
    }
    
    public void establecerSueldo(double sue){
        
        sueldo = sue; 
        
    }
    
    public String obtenerNombreE(){
        
        return nombreE;
        
    }
    
    public String obtenerTipo(){
        
        return tipoC;
        
    }
    
    public double obtenerSueldo(){
        
        return sueldo;
        
    }
    
}
