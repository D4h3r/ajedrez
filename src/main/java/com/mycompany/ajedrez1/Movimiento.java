package com.mycompany.ajedrez1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAHER
 */
public interface Movimiento {
    boolean esValido(Tablero tablero, int desdeX, int desdeY, int hastaX, int hastaY);
}
