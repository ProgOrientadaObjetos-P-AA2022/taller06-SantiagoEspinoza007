/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import java.util.Scanner;
import paquete2.Enfermero;
import paquete2.EntidadHospitalaria;
import paquete2.Medico;

/**
 * @author Edgar-Espinoza
 */
public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String nombreHospital;
        String direccion;
        String ciudad;
        String provincia;
        int numEspecialidades;
        int n1;
        int n2;
        Medico [] medicos;
        Enfermero [] enfermeros;
        
        //Ingreso de valores por teclado
        System.out.println("Ingrese el nombre del Hospital: ");
        nombreHospital = leer.nextLine();
        System.out.println("Ingrese la dirección del Hospital: ");
        direccion = leer.nextLine();
        System.out.println("Ingrese la ciudad en la que está ubicado el Hospital: ");
        ciudad = leer.nextLine();
        System.out.println("Ingrese la provincia en la que está ubicado el Hospital: ");
        provincia = leer.nextLine();
        System.out.println("Ingrese el número de especialidades disponibles en el Hospital: ");
        numEspecialidades = leer.nextInt();
        System.out.println("¿Cuántos doctores va a ingresar?");
        n1 = leer.nextInt();
        System.out.println("¿Cuántos enfermeros va a ingresar?");
        n2 = leer.nextInt();
        
        leer.nextLine();
        
        
        
    }
    
}
