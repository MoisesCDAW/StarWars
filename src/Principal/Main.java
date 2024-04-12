
package Principal;

import Proyecto.*;
import java.util.*;

/**
 * <h2> Comprueba el funcinamiento de varios métodos de los objetos de las clases</h2>
 * @version 4.2024
 * @author Moisés Campos
 * @since 11-04-2024
 */
public class Main {

    /**
     * @param args los argumentos de la línea de comando
     */
    public static void main(String[] args) {

        System.out.println("\n------- Apatardo Jedi -------\n");
        Jedi j1 = new Jedi("Anakin Skywalker", 9, 19000);
        Jedi j2 = new Jedi("Darth Sidious", 18, 0);
        Jedi j3 = new Jedi("Conde Dooku", 8, 18000);

        j1.presentarse();
        j1.enamorarse(j2);
        Jedi.bloquear(j1);
        Jedi.bloquear(j2);
        Jedi.bloquear(j3);
        System.out.println(j1);

        Arrays.sort(Jedi.getBloqueados());
        System.out.println("\nOrdenado por nombres: "+Arrays.toString(Jedi.getBloqueados()));

        System.out.println("\n------- Apatardo Aprendiz -------\n");
        Aprendiz a1 = new Aprendiz("Ahsoka Tano", 9, 19000);
        Aprendiz a2 = new Aprendiz("Darth Maul", 8, 17000);
        Aprendiz a3 = new Aprendiz("Darth Maul", 8, 17000);

        a1.entrenar();
        a1.elegirMaestro(j1);
        a1.despiertaFuerza();
        System.out.println("\n"+a1);

        System.out.println("a2 y a3 son iguale? "+a2.equals(a3));
        System.out.println("a1 y a3 son iguale? "+a1.equals(a3));

        System.out.println("\n------- Apatardo Cementerio -------\n");

        CementerioJedi c1 = new CementerioJedi();
    
        System.out.println("COMBATE!\n"+c1.combate(j1, j2)+"\n");
        System.out.println(c1+"\n");
        System.out.println("COMBATE!\n"+c1.combate(a1, j3)+"\n");
        System.out.println(c1+"\n");

    }
    
}
