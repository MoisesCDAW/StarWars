/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

import java.util.*;

/**
 *
 * @author moise
 */
public class Jedi implements Comparable{
    // Atributos
    private String nombre;
    private int fuerza; // un máximo de 10 puntos
    private ESTADO estado;
    final private int midiclorianos; // un máximo de 20,000 mil puntos
    private boolean enamorado;
    private Jedi[] bloqueados;
    private String pareja;
    private LADOFUERZA ladoFuerza; // Lado oscuro o el de la luz
              
    
    // Constructor
    public Jedi(String nombre, int fuerza, int midiclorianos){
        setNombre(nombre);
        setFuerza(fuerza);
        
        this.estado = ESTADO.VIVO;
        
        if (midiclorianos<1) {
            System.out.println("Se ingresó una cantidad errónea de midiclorianos.");
            this.midiclorianos = 1;
        }else{this.midiclorianos = midiclorianos;}
        
        this.pareja = "Sin pareja";
        
        this.ladoFuerza = LADOFUERZA.LUZ;
        
    }
    
    
    // Métodos
    public String presentarse(){
        return String.format("PRESENTACIÓN DEL JEDI\nNombre: %s\nMidiclorianos: %d\nLado de la fuerza: %s\n",
                this.nombre, this.midiclorianos, this.ladoFuerza);
    }
    
    public void enamorarse(Jedi pareja){
        this.pareja = pareja.nombre;
        this.enamorado = true;
    }
    
    public void bloquear(Jedi jedi){ // PENDIENTE
        
    }
    
    @Override 
    public String toString(){ // PENDIENTE
        return String.format("DETALLES DEL JEDI\nNombre: %s\nFuerza: %d\nEstado: %s\nMidiclorianos: %d\nEstá enamorado? %s\n"
                + "Pareja: %s\nLado de la fuerza: %s\nLISTA DE JEDI BLOQUEADOS\n%s", this.nombre, this.fuerza, this.estado,
                this.midiclorianos, this.enamorado, this.pareja, this.ladoFuerza, Arrays.toString(this.bloqueados));
    }

    @Override
    public boolean equals(Object o){ // PENDIENTE
        return true;
    }

    @Override
    public int compareTo(Object o) { // PENDIENTE
        return 1;
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public ESTADO getEstado() {
        return estado;
    }

    public void setEstado(ESTADO estado) {
        this.estado = estado;
    }

    public int getMidiclorianos() {
        return midiclorianos;
    }

    public boolean isEnamorado() {
        return enamorado;
    }

    public void setEnamorado(boolean enamorado) {
        this.enamorado = enamorado;
    }

    public Jedi[] getBloqueados() {
        return bloqueados;
    }

    public void setBloqueados(Jedi[] bloqueados) {
        this.bloqueados = bloqueados;
    }

    public String getPareja() {
        return pareja;
    }

    public void setPareja(String pareja) {
        this.pareja = pareja;
    }

    public LADOFUERZA getLadoFuerza() {
        return ladoFuerza;
    }

    public void setLadoFuerza(LADOFUERZA ladoFuerza) {
        this.ladoFuerza = ladoFuerza;
    }
}
