package com.mycompany.ajedrez1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAHER
 */
public class Tablero {
    private Pieza[][] tablero = new Pieza[8][8];

    public Pieza getPiece(int x, int y) {
        return tablero[x][y];
    }

    public void setPiece(int x, int y, Pieza pieza) {
        tablero[x][y] = pieza;
    }
}

