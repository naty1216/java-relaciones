/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Ed-Naty
 */
public class Metodo {
    public static int generaNumeroAleatorio(int minimo,int maximo){
        int num =(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
        return num;
    }
    
}