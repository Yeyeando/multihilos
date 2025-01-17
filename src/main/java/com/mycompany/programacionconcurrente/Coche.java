package com.mycompany.programacionconcurrente;

import javax.swing.JSlider;
import javax.swing.SwingUtilities;

public class Coche {
    private int distanciaRecorrida = 0;
    private final int velocidad;
    private final int distanciaTotal;
    private boolean finCarrera = false;

    public Coche(int velocidad, int distanciaTotal) {
        this.velocidad = velocidad;
        this.distanciaTotal = distanciaTotal;
    }

    public void avanzar(JSlider slider) {
        if (!finCarrera) {
            distanciaRecorrida += velocidad;
            if (distanciaRecorrida >= distanciaTotal) {
                distanciaRecorrida = distanciaTotal;
                finCarrera = true;
            }

            int progreso = (int) ((distanciaRecorrida / (float) distanciaTotal) * 100);
            SwingUtilities.invokeLater(() -> slider.setValue(progreso));
        }
    }

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void detenerCarrera() {
        finCarrera = true;
    }
}
