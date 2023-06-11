/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ajedrez1;

/**
 *
 * @author DAHER
 */
public class Alfil extends Pieza {
    public Alfil(int color) {
        super(color);
    }

    @Override
    public boolean esValido(Tablero tablero, int desdeX, int desdeY, int hastaX, int hastaY) {
        // Implementar lógica de movimiento para el Alfil
        return true; // esto solo es un marcador de posición
    }
}

