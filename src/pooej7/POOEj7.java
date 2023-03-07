/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej7;

import Entidad.Persona;
import Servicio.ServicioPersona;

/**
 *
 * @author 54343
 */
public class POOEj7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          ServicioPersona sp1 = new ServicioPersona();
        
        float [] vector1 = new float[4];
        int [] vector2 = new int [4];
        int contBajoPeso = 0, contPesoIdeal = 0, contSobrepeso = 0, contMayor = 0, contMenor = 0;
        
        System.out.println("Persona 1");
        Persona p1 = sp1.crearPersona();
        sp1.calcularIMC(p1);
        sp1.esMayorDeEdad(p1);
        vector1[0] = p1.getImc();
        vector2[0] = p1.getEdad();
        
        System.out.println("Persona 2");
        Persona p2 = sp1.crearPersona();
        sp1.calcularIMC(p2);
        sp1.esMayorDeEdad(p2);
        vector1[1] = p2.getImc();
        vector2[1] = p2.getEdad();
        
        System.out.println("Persona 3");
        Persona p3 = sp1.crearPersona();
        sp1.calcularIMC(p3);
        sp1.esMayorDeEdad(p3);
        vector1[2] = p3.getImc();
        vector2[2] = p3.getEdad();
        
        System.out.println("Persona 4");
        Persona p4 = sp1.crearPersona();
        sp1.calcularIMC(p4);
        sp1.esMayorDeEdad(p4);
        vector1[3] = p4.getImc();
        vector2[3] = p4.getEdad();
        
        float promedio = (p1.getImc() + p2.getImc() + p3.getImc() + p4.getImc()) / 4;
        System.out.println("El promedio de IMC es de: " + promedio);
        
        for (int i = 0; i < 4; i++) {
            if (vector1[i] < 20){
                contBajoPeso += 1;
            } else if(vector1[i] >= 20 && vector1[i] <= 25){
                contPesoIdeal += 1;
            } else if (vector1[i] > 25){
                contSobrepeso += 1;
            }
        }
        System.out.println("Personas con bajo peso: " + contBajoPeso + "\n"
        + "Personas con peso ideal: " + contPesoIdeal + "\n"
        + "Personas con sobrepeso: " + contSobrepeso);
        
        for (int i = 0; i < 4; i++) {
            if(vector2[i] < 18){
                contMenor += 1;
            }else{
                contMayor += 1;
            }
        }
        
        float porcentajeMenor = contMenor / 4 * 100;
        float porcentajeMayor = contMayor / 4 * 100;
        System.out.println("El porcentaje de los menores es de: " + porcentajeMenor + "%");
        System.out.println("El porcentaje de los mayores es de: " + porcentajeMayor + "%");
        
    }        
    
    }
    