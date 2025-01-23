/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionconcurrente;

/**
 *
 * @author Alumno
 */
public class Orden extends Thread {
    int id;
    public Orden(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        mostrarId();
    }
    
    private void mostrarId(){
        for (int i = 0; i < id; i++) {
            System.out.println("soy: "+ id);
        }
    }
}
