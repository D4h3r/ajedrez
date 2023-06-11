package com.mycompany.ajedrez1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author DAHER
 */
public class Ajedrez1 {

    public static void main(String[] args) {
        // Crear una nueva instancia del juego
        Juego juego = new Juego();
        
        while (!juego.isGameOver()) {
            try {
                // Intenta jugar un turno
                juego.jugar();
            } catch (MovimientoIlegalException e) {
                // Si se lanza una excepción, imprime el mensaje de error
                System.out.println(e.getMessage());
            }
        }
        
        // Anuncia el ganador (o el empate)
        if (juego.getGanador() == null) {
            System.out.println("El juego terminó en empate.");
        } else {
            System.out.println("El ganador es " + juego.getGanador());
        }
    }
}
