/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Edgar Espinoza
 */
public class Medico {
    
    private String nombreDoc;
    private String especialidadDoc;
    private double sueldoMensual;
    
    public Medico(String nom, String esDoc, double suelM){
        
        nombreDoc = nom;
        especialidadDoc = esDoc;
        sueldoMensual = suelM;
        
    }
    
    public void establecerNombreDoc(String nom){
        
        nombreDoc = nom;
        
    }
    
    public void establecerEspecialidadDoc(String espe){
        
        especialidadDoc = espe;
        
    }
    
    public void  establecerSueldoMensual(double suM){
        
        sueldoMensual = suM;
        
    }
    
    public String obtenerNombreDoc(){
        
        return nombreDoc;
        
    }
    
    public String obtenerEspecialidadDoc(){
        
        return especialidadDoc;
        
    }
    
    public double obtenerSueldoMensual(){
        
        return sueldoMensual;
        
    }
    
}
