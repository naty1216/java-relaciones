/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.List;

/**
 *
 * @author Ed-Naty
 */
public class Persona {
    private String nombre, apellido;
    private int edad , dni;
    //private List <Perro> masc;
    private Perro masc;
    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int dni, Perro masc) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.masc = masc;
    }

 

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Perro getMasc() {
        return masc;
    }

    public void setMasc(Perro masc) {
        this.masc = masc;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", masc=" + masc + '}';
    }

   

   

    

    

    
    
}
