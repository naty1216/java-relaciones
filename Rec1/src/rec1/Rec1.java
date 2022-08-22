/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rec1;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.List;

/**Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 *
 * @author Ed-Naty
 */
public class Rec1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona per1 =new Persona();
        per1.setNombre("Thiago");
        per1.setApellido("Cabrera");
        per1.setEdad(9);
        
        Persona per2=new Persona();
        per2.setApellido("Cabrera");
        per2.setNombre("Bruno");
        per2.setEdad(7);
        
      //List <Perro> masc=new ArrayList <Perro>();
      
      Perro masc1=new Perro();
      masc1.setNombre("Bonnie");
      masc1.setRaza("caniche");
      masc1.setTamaño("chico");
      
      Perro masc2=new Perro();
      masc2.setNombre("Morrison");
      masc2.setRaza("salchicha");
      masc2.setTamaño("chico");
      
      //masc.add(masc1);
      //masc.add(masc2);
      per1.setMasc(masc1);
      //per1.setMasc(masc1);
      per2.setMasc(masc2);
      
      System.out.println("la persona "+per1.getNombre()+" "+per1.getApellido()+"tiene como mascota a :" +per1.getMasc());
        System.out.println(per1);  
      System.out.println("la persona "+per2.getNombre()+" "+per2.getApellido()+"tiene como mascota a :" +per2.getMasc());
        System.out.println(per2);  
    }
    
}
