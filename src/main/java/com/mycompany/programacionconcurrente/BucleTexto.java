package com.mycompany.programacionconcurrente;

public class BucleTexto extends Thread {
    private Thread detenerOtroHilo;
    private String texto; 
    private int iterarTexto;

    public BucleTexto(String texto, int iterarTexto, Thread detenerOtroHilo) {
        this.texto = texto;
        this.iterarTexto = iterarTexto;
        this.detenerOtroHilo = detenerOtroHilo;
    }

    public void setDetenerOtroHilo(Thread detenerOtroHilo) {
        this.detenerOtroHilo = detenerOtroHilo;
    }

    public BucleTexto(String texto, int iterarTexto) {
        this(texto, iterarTexto, null);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < iterarTexto; i++) {
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
                System.out.println(texto);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Hilo '" + texto + "' interrumpido.");
        } finally {
            if (detenerOtroHilo != null) {
                detenerOtroHilo.interrupt();
                }
            }
        }
}
