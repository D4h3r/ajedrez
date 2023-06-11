package com.mycompany.ajedrez1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAHER
 */
public class Jugador {
    private String nombre;
    private List<Pieza> piezas = new ArrayList<>();
    
    public Jugador(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public List<Pieza> getPiezas() {
        return piezas;
    }
}
