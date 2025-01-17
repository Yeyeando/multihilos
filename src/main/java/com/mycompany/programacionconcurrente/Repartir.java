/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionconcurrente;

/**
 *
 * @author Alumno
 */
public class Repartir extends Thread{
    private int hilo;
    private int cantidadHilos;
    private int contar;

    public Repartir(int hilo, int cantidadHilos, int contar) {
        this.hilo = hilo;
        this.cantidadHilos = cantidadHilos;
        this.contar = contar;
    }

   @Override
    public void run() {
        mostrarSecuencia();
    }
    
    private void mostrarSecuencia(){
        if (cantidadHilos>contar) {
            System.out.println("Ponga una cantidad de hilos menor");
        }
        else{
            for (int i = contar/cantidadHilos*(hilo-1); i < contar/cantidadHilos*hilo; i++) {
                System.out.println(i+1);
            }
            if (hilo == cantidadHilos && contar/cantidadHilos!=0) {
                for (int i = contar-contar%cantidadHilos; i < contar; i++) {
                    System.out.println(i+1);
                }
            }
        }
        
    }
}
