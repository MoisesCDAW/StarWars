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
        CementerioJedi c1 = new CementerioJedi();
        System.out.println(c1);
        
        Jedi j1 = new Jedi("Max", 5, 23);
        System.out.println(j1);
        
//        Arrays.sort(j1.getBloqueados(), new comparaFuerza()); // Para ordenar los Jedi por su nivel de fuerza
    }
    
}
