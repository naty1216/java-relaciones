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
public class Juego {

    private Jugador[] jugadores;
    private RevolverDeAgua revolver;

//    public Juego(Jugador[] jugadores, RevolverDeAgua revolver) {
//        this.jugadores = jugadores;
//        this.revolver = revolver;
//    }
//
//    public Juego() {
//    }
    

    public Juego(int numJugadores) {

        jugadores = new Jugador[comprobarJugadores(numJugadores)];

        crearJugadores();

        revolver = new RevolverDeAgua();
        System.out.println(revolver);

    }

    private void crearJugadores() {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = new Jugador(i + 1);
        }
    }

    private int comprobarJugadores(int numJugadores) {
        if (!(numJugadores >= 1) && (numJugadores <= 6)) {
            numJugadores = 6;
        }
        return numJugadores;
    }

    public boolean findejuego() {
        boolean fin = true;
        for (int i = 0; i<jugadores.length;i++) {
            if (!jugadores[i].isMojado()) {
                fin=false;
            }
        }
        return fin;
    }

    public void ronda() {
        for (int i = 0; i<jugadores.length;i++) {
            jugadores[i].disparo(revolver);
            
        }
    }
}
