/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacionconcurrente;

/**
 *
 * @author Alumno
 */



//////tarea 1
//public class Programacionconcurrente {
//
//    public static void main(String[] args) throws InterruptedException {
//         Cuenta cuenta1 = new Cuenta(true, 20);
//         Cuenta cuenta2 = new Cuenta(false, 20);
//         cuenta1.start();
//         cuenta1.join();
//         cuenta2.start();
//    }
//}

//tarea 2
//public class Programacionconcurrente {
//
//    public static void main(String[] args) throws InterruptedException {
//         Repartir reparte1 = new Repartir(1, 4, 10);
//         Repartir reparte2 = new Repartir(2, 4, 10);
//         Repartir reparte3 = new Repartir(3, 4, 10);
//         Repartir reparte4 = new Repartir(4, 4, 10);
//         
//         reparte1.start();
//         reparte1.join();
//         reparte2.start();
//         reparte2.join();
//         reparte3.start();
//         reparte3.join();
//         reparte4.start();
//         reparte4.join();
//    }
//}

//tarea 3
//import java.util.LinkedList;
//import java.util.List;
//import javax.swing.JFrame;
//
//public class Programacionconcurrente {
//    public static void main(String[] args) {
//        Coche c1 = new Coche(5, 150);
//        Coche c2 = new Coche(10, 150);
//        Coche c3 = new Coche(16, 150);
//        Coche c4 = new Coche(20, 150);
//
//        List<Coche> coches = new LinkedList<>();
//        coches.add(c1);
//        coches.add(c2);
//        coches.add(c3);
//        coches.add(c4);
//
//        Carrera carrera = new Carrera(coches);
//        carrera.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        carrera.setSize(600, 300);
//        carrera.setVisible(true);
//    }
//}

//tarea 4
//public class Programacionconcurrente {
//    public static void main(String[] args) throws InterruptedException {
//        BucleTexto t1 = new BucleTexto("hola", 3);
//        BucleTexto t2 = new BucleTexto("buenas", 20);
//        t1.setDetenerOtroHilo(t2);
//
//        t1.start();
//        t2.start();
//    }
//}

//tarea5
//public class Programacionconcurrente {
//    public static void main(String[] args) throws InterruptedException {
//        Orden o1 = new Orden(1);
//        Orden o2 = new Orden(2);
//        Orden o3 = new Orden(3);
//        Orden o4 = new Orden(4);
//
//        o1.start();
//        o1.join();
//        o2.start();
//        o2.join();
//        o3.start();
//        o3.join();
//        o4.start();
//    }
//}


