/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Edgar Espinoza
 */
public class EntidadHospitalaria {
    
    private String nombreHospital;
    private CiudadHospital ciudad;
    private int numEspecialidades;
    private Medico[] conjuntoMedicos;
    private Enfermero[] conjuntoEnfermeros;
    private double sueldos;
    private String direccionH;
    
    public EntidadHospitalaria(String nom, CiudadHospital ciuda, int num, 
        String direccion){
        
        
        
    }
    public void establecerNombreH(String nom){
        
        nombreHospital = nom;
        
    } 
    
    public void establecerCiudadHospital(CiudadHospital hos){
        
        ciudad = hos;
        
    }
    
    public void establecerNumEspecialidades(int num){
        
        numEspecialidades = num;
        
    }
    
    public void establecerConjuntoMedicos(Medico[] m){
      
        conjuntoMedicos = m;  
    
    }
    
    public void establecerConjuntoEnfermeros(Enfermero [] e){
     
        conjuntoEnfermeros = e;
        
    }
    
    public void establecerSueldos(){
        double suma = 0;
        for (int i = 0; i < conjuntoMedicos.length; i++) {
            
            suma = suma + 
            
        }
        
    }
    
    public void establecerDireccionH(String dir){
        
        direccionH = dir;
        
    }
    public String obtenerNombreH(){
        
        return nombreHospital;
        
    } 
    
    public CiudadHospital obtenerCiudadHospital(){
        
        return ciudad;
        
    }
    
    public int obtenerNumEspecialidades(){
        
        return numEspecialidades;
        
    }
    
    public Medico []obtenerConjuntoMedicos(){
      
        return conjuntoMedicos;  
    
    }
    
    public Enfermero [] obtenerConjuntoEnfermeros(){
     
        return conjuntoEnfermeros;
        
    }
    
    public double obtenerSueldos(){
        
        return sueldos;
        
    }
    
    public String obtenerDireccionH(){
        
        return direccionH;
        
    }
    
    @Override
    public String toString(){
        cadena = String.format("%s"),;
        return cadena;
    }
}
