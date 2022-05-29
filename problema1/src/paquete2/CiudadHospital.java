/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Edgar Espinoza
 */
public class CiudadHospital {
    
    private String nombreC;
    private String provinciaC;
    
    
    public CiudadHospital(String nom, String prov){
        
        nombreC = nom;
        provinciaC = prov;
        
    }
    
    public void establecerNombreC(String nom){
    
        nombreC = nom;
    
    }
    
    public void establecerProvinciaC(String prov){
        
        provinciaC = prov;
        
    }
    
    public String obtenerNombreC(){
        
        return nombreC;
        
    }
    
    public String obtenerProvincia(){
        
        return provinciaC;
        
    }

}
