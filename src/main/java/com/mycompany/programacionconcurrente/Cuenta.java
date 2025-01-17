/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionconcurrente;

/**
 *
 * @author Alumno
 */
public class Cuenta extends Thread {
    private boolean primero;
    private int meta;
    // Constructor para inicializar la variable primero
    public Cuenta(boolean primero, int meta) {
        this.primero = primero;
        this.meta = meta;
    }

    @Override
    public void run() {
        mostrarSecuencia();
    }
    
    private void mostrarSecuencia(){
        if (primero) {
            for (int i = 1; i < meta/2; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = meta/2; i < meta+1; i++) {
                System.out.println(i);
            }
        }
    }
}
