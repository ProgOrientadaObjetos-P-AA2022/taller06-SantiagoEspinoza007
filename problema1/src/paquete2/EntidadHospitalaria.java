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
    private String direccionH;
    private CiudadHospital hospital;
    private int numEspecialidades;
    private Medico[] conjuntoMedicos;
    private Enfermero[] conjuntoEnfermeros;
    private double sueldos;
    
    public EntidadHospitalaria(String nomH, String direc, CiudadHospital hos,   
            int numE, Medico [] me, Enfermero[] en){
        
        nombreHospital = nomH;
        direccionH = direc;
        hospital = hos;
        numEspecialidades = numE;
        conjuntoMedicos = me;
        conjuntoEnfermeros = en;
                
    }
    
    public void establecerNombreH(String nom){
        
        nombreHospital = nom;
        
    } 
    
    public void establecerDireccionH(String dir){
        
        direccionH = dir;
        
    }
    
    public void establecerCiudadHospital(CiudadHospital hos){
        
        hospital = hos;
        
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
    
    public void calcularSueldos(){
        double suma = 0;
        for (int i = 0; i < obtenerConjuntoMedicos().length; i++) {
            suma = suma + obtenerConjuntoMedicos()[i].obtenerSueldoMensual();
        }
        
        for (int j = 0; j < obtenerConjuntoEnfermeros().length; j++) {
            suma = suma + obtenerConjuntoEnfermeros()[j].obtenerSueldo();
        }
        
        sueldos = suma;
        
    }
    
    public String obtenerNombreH(){
        
        return nombreHospital;
        
    }
    
    public String obtenerDireccionH(){
        
        return direccionH;
        
    }
    
    public CiudadHospital obtenerCiudadHospital(){
        
        return hospital;
        
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
    
    @Override
    public String toString(){
        String cadena = String.format("%s\n"
                + "Dirección: %s\n"
                + "Ciudad: %s\n"
                + "Provincia: %s\n"
                + "Número de especialidades: %s\n", obtenerNombreH(), obtenerDireccionH(),    
                    obtenerCiudadHospital().obtenerNombreC(),
                    obtenerCiudadHospital().obtenerProvinciaC(), obtenerNumEspecialidades());
        cadena = String.format("%sListado de Medicos\n",cadena);
        for (int i = 0; i<conjuntoMedicos.length; i++) {
            cadena = String.format("%s-%s - sueldo: %s - %s \n", cadena,   
                    obtenerConjuntoMedicos()[i].obtenerNombreDoc(), 
                    obtenerConjuntoMedicos()[i].obtenerSueldoMensual(),
                    obtenerConjuntoMedicos()[i].obtenerEspecialidadDoc());
        }
        cadena = String.format("%s\nListado de enfermeros(as)\n", cadena);
        for (int i = 0; i<conjuntoMedicos.length; i++) {
            cadena = String.format("%s-%s - sueldo: %s - %s \n", cadena,   
                    obtenerConjuntoEnfermeros()[i].obtenerNombreE(),    
                    obtenerConjuntoEnfermeros()[i].obtenerSueldo(), 
                    obtenerConjuntoEnfermeros()[i].obtenerTipo());
        }
        
        cadena = String.format("%s\nTotal de sueldos a pagar por mes: %.2f\n", cadena,   
                obtenerSueldos());
        return cadena;
    }
}
