/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import java.util.Scanner;
import paquete2.CiudadHospital;
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
        Medico [] medi;
        Enfermero [] enfe;
        int numEspecialidades;
        int n1;
        int n2;
        
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
        
        CiudadHospital hospital = new CiudadHospital(ciudad, provincia);
        //Se crea el objeto con los datos ingresados
        
        System.out.println("¿Cuántos medicos va a ingresar?");
        n1 = leer.nextInt();
        
        //variables para los medicos
        medi = new Medico[n1];
        String nom;
        String esDoc;
        double suelM;
        
        for (int i = 0; i < medi.length; i++) {
            leer.nextLine();
            //Ingreso de valores para los medicos
            System.out.printf("Ingrese el nombre del medico %d\n", i + 1);
            nom = leer.nextLine();
            System.out.printf("Ingrese la especialidad del medico%d\n", i + 1);
            esDoc = leer.nextLine();
            System.out.printf("Ingrese el sueldo del medico%d\n", i + 1);
            suelM = leer.nextDouble();
            Medico med = new Medico(nom, esDoc, suelM);
            
            medi[i] = med;
            
        }
        
        System.out.println("¿Cuántos enfermeros va a ingresar?");
        n2 = leer.nextInt();
        //variables para los enfermeros(as)
        enfe = new Enfermero[n2];
        String nomE;
        String tipoE;
        double suelE;
        
        for (int j = 0; j < enfe.length; j++) {
            leer.nextLine();
            //Ingreso de valores para los enfermeros
            System.out.printf("Ingrese el nombre de enfermero(ra) %d\n", j + 1);
            nomE = leer.nextLine();
            System.out.printf("Ingrese el tipo de contrato de enfermero(ra) %d\n", j + 1);
            tipoE = leer.nextLine();
            System.out.printf("Ingrese el sueldo de enfermero(ra) %d\n", j + 1);
            suelE = leer.nextDouble();
            Enfermero enf = new Enfermero(nomE, tipoE, suelE);
            
            enfe[j] = enf;
        }
        
        EntidadHospitalaria enti = new EntidadHospitalaria(nombreHospital, direccion,   
                hospital, medi, enfe);
        
        enti.calcularSueldos();
        enti.establecerConjuntoMedicos(medi);
        enti.establecerConjuntoEnfermeros(enfe);
        System.out.printf("\n%s\n", enti);
        
    }
    
}
