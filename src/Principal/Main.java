/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

import Proyecto.*;
import Comparator.*;
import java.util.*;

/**
 *
 * @author moise
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("\n------- Apatardo Jedi -------\n");
        Jedi j1 = new Jedi("Anakin Skywalker", 9, 19000);
        Jedi j2 = new Jedi("Darth Sidious", 8, 18000);

        j1.presentarse();
        j1.enamorarse(j2);
        Jedi.bloquear(j1); // PENDIENTE
        System.out.println(j1);

        System.out.println("\n------- Apatardo Aprendiz -------\n");
        Aprendiz a1 = new Aprendiz("Ahsoka Tano", 9, 19000);
        Aprendiz a2 = new Aprendiz("Darth Maul", 17, 17000);

        a1.entrenar();
        a1.elegirMaestro(j1);
        a1.despiertaFuerza();
        System.out.println(a1);

        System.out.println("\n------- Apatardo Cementerio -------\n");

        CementerioJedi c1 = new CementerioJedi();
        c1.combate(j1, j2);
        System.out.println(c1);
    }
    
}
