/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 * Métodos: • llenarRevolver(): le pone los valores de posición actual y de
 * posición del agua. Los valores deben ser aleatorios. • mojar(): devuelve true
 * si la posición del agua coincide con la posición actual • siguienteChorro():
 * cambia a la siguiente posición del tambor • toString(): muestra información
 * del revolver (posición actual y donde está el agua)
 *
 * @author Ed-Naty
 */
public class RevolverDeAgua {

    private int posicionActual;
    private int posicionAgua;

    public RevolverDeAgua() {
        posicionActual = (int) (Math.random() * 7 + 1);
        posicionAgua = (int) (Math.random() * 7 + 1);
    }

//    public void llenarRevolver() {
//        posicionActual = Metodo.generaNumeroAleatorio(1, 6);
//        posicionAgua = Metodo.generaNumeroAleatorio(1, 6);
//    }
    public boolean mojar() {
        boolean moja = false;
        if (posicionActual == posicionAgua) {
            moja = true;
            return moja;

        }
        siguenteChorro();
        return moja;
    }

    public void siguenteChorro() {
        if (posicionActual == 6) {
            posicionActual = 1;
            System.out.println(this.posicionActual);
            System.out.println(this.posicionAgua);
        } else {
            posicionActual++;
            System.out.println(this.posicionActual);
            System.out.println(this.posicionAgua);
        }
    }

    public String toString() {
        return "la Posicion actual: " + posicionActual + ", la posicion de agua es : " + posicionAgua;

    }

}
