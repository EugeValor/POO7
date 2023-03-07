/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author 54343
 */
public class ServicioPersona {
      Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        
        Persona p1 = new Persona();
        System.out.println("Ingrese el nombre de la persona:");
        p1.setNombre(leer.next());
        System.out.println("Ingrese la edad:");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese el sexo:");
        String sexo = leer.next();
        if (!(sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("O"))) {
            do{
                System.out.println("Error. Ingrese nuevamente el sexo");
                sexo = leer.next();
            } while (!(sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("O")));
        }
        p1.setSexo(sexo);
        System.out.println("Ingrese la altura:");
        p1.setAltura(leer.nextFloat());
        System.out.println("Ingrese el peso:");
        p1.setPeso(leer.nextFloat());
        
        return p1;
        
    }

    public float calcularIMC(Persona p1){
        
        p1.setImc(p1.getPeso() / (p1.getAltura() * p1.getAltura()));
        if(p1.getImc() < 20){
            System.out.println("IMC: -1");
        } else if (p1.getImc() >= 20 && p1.getImc() <= 25){
            System.out.println("IMC: 0");
        } else if (p1.getImc() > 25){
            System.out.println("IMC: 1");
        }
        
        return p1.getImc();
        
    }
    
    public boolean esMayorDeEdad(Persona p1){
        
        boolean mayor = true;
        if(p1.getEdad() < 18){
            mayor=false;
            System.out.println("Es menor de edad");
        }else{
            System.out.println("Es mayor de edad");
        }
 
        return mayor;
        
    }
}

    
