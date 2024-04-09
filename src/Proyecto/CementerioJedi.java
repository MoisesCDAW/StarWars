/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;
import java.util.*;
import java.time.LocalDateTime;
/**
 *
 * @author moise
 */
public class CementerioJedi {
    // Atributos
    static private LocalDateTime[] Fecha={};
    static private Jedi[] JediRip={};
    static private String[] Verdugo={};
    
    /* Constructor
    public CementerioJedi(){
        
    }*/
    
    // Método
    private int dados(){
        return (int)((Math.random()*6)+1);
    }
    
    public String combate(Jedi jedi1, Jedi jedi2){
        int puntuaJedi1 = dados() + jedi1.getFuerza();
        int puntuaJedi2 = dados() + jedi2.getFuerza();
        
        if (puntuaJedi1==puntuaJedi2) {
            return "Hubo un empate en este combate!";
        }else{
            Fecha = Arrays.copyOf(Fecha, Fecha.length+1);
            Fecha[Fecha.length-1] = LocalDateTime.now();
            
            JediRip = Arrays.copyOf(JediRip, JediRip.length+1);
            Verdugo = Arrays.copyOf(Verdugo, Verdugo.length+1);  
        }
        
        if (puntuaJedi1>puntuaJedi2) {
            JediRip[JediRip.length-1] = jedi2;
            Verdugo[Verdugo.length-1] = jedi1.getNombre();
            return "El ganador es: "+jedi1.getNombre();  
            
        }else{
            JediRip[JediRip.length-1] = jedi1;
            Verdugo[Verdugo.length-1] = jedi2.getNombre();
            return "El ganador es: "+jedi2.getNombre();
        }      
    }
    
    public String mostrarCaidos(){ // PENDIENTE
        
//        for (int i = 0; i < JediRip.length; i++) {
//            
//        }
        return "";
    }
    
    
    public String toStrinng(){ // PENDIENTE
        return "";
    }
    
    public boolean equals(){ // PENDIENTE
        return true;
    }
}
