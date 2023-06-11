package com.mycompany.ajedrez1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAHER
 */
public class Juego {
    private Jugador jugador1;
    private Jugador jugador2;
    private Tablero tablero;
    private Jugador jugadorActual;

    public Juego(Jugador jugador1, Jugador jugador2, Tablero tablero) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.tablero = tablero;
        this.jugadorActual = jugador1; // Jugador1 inicia el juego
    }

    public Jugador getJugadorActual() {
        return jugadorActual;
    }

    public void cambiarTurno() {
        jugadorActual = (jugadorActual == jugador1) ? jugador2 : jugador1;
    }

    public void jugar() {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            tableroAjedrez.mostrarTablero();

            if (isJuegoTerminado()) {
                break;
            }

            System.out.print("Jugador " + (jugadorActual == BLANCO ? "Blanco" : "Negro") + ", introduzca su movimiento: ");
            String movimiento = entrada.nextLine();

            try {
                realizarMovimiento(movimiento);
                cambiarTurnoJugador();
            } catch (MovimientoIlegalException e) {
                System.out.println(e.getMessage());
            }
        }

        entrada.close();
    }

    private void realizarMovimiento(String movimiento) throws MovimientoIlegalException {
        // TODO: Implementar la lógica para realizar un movimiento.
        // Lanza una MovimientoIlegalException si el movimiento es inválido.
    }

    private void cambiarTurnoJugador() {
        jugadorActual = (jugadorActual == BLANCO ? NEGRO : BLANCO);
    }

    private boolean isJuegoTerminado() {
        // TODO: Implementar la lógica para determinar si el juego ha terminado.
        return false;
    }

    public String getGanador() {
        // TODO: Implementar la lógica para determinar el ganador del juego.
        return null;
    }
}


