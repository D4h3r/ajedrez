package com.mycompany.ajedrez1;

import <any?>;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAHER
 */
public class Torre extends Pieza {
    public Torre(int color) {
        super(color);
    }

    @Override
    public boolean esValido(Tablero tablero, int desdeX, int desdeY, int hastaX, int hastaY) {
        // Implementar lógica de movimiento para la Torre
        return true; // esto solo es un marcador de posición
    }
}
