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
    private double fuerza; // un máximo de 10 puntos
    private ESTADO estado;
    final private int midiclorianos; // un máximo de 20,000 mil puntos
    private boolean enamorado;
    static String[] bloqueados = new String[0];
    private String pareja;
    private LADOFUERZA ladoFuerza; // Lado oscuro o el de la luz
              
    
    // Constructor
    public Jedi(String nombre, double fuerza, int midiclorianos){
        setNombre(nombre);
        setFuerza(fuerza);
        
        this.estado = ESTADO.VIVO;
        
        if (midiclorianos<1) {
            System.out.println("\nERROR en "+this.nombre+". Se ingresó una cantidad errónea de midiclorianos.\n");
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
    
    public static void bloquear(Jedi jedi){ // Suponiendo que la lista es para la clase Jedi y no para sus objetos
        
        Jedi.bloqueados = Arrays.copyOf(bloqueados, bloqueados.length+1);
        Jedi.bloqueados[bloqueados.length-1] = jedi.nombre;
        
        if (jedi.enamorado) {
            jedi.setEnamorado(false);
            jedi.setPareja("Sin pareja");
        }     
    }
    
    @Override 
    public String toString(){
        return String.format("DETALLES DEL JEDI\nNombre: %s\nFuerza: %.2f\nEstado: %s\nMidiclorianos: %d\nEstá enamorado? %s\n"
                + "Pareja: %s\nLado de la fuerza: %s\n\nLISTA DE JEDI BLOQUEADOS\n%s", this.nombre, this.fuerza, this.estado,
                this.midiclorianos, this.enamorado, this.pareja, this.ladoFuerza, Arrays.toString(Jedi.bloqueados));
    }

    @Override
    public boolean equals(Object o){
        Jedi otroJedi = (Jedi)o;
        return this.nombre.equals(otroJedi.nombre) &&
            this.fuerza==otroJedi.fuerza &&
            this.estado.equals(otroJedi.estado) &&
            this.midiclorianos==otroJedi.midiclorianos &&
            this.enamorado==otroJedi.enamorado &&
            this.pareja.equals(otroJedi.pareja) &&
            this.ladoFuerza.equals(otroJedi.ladoFuerza);
    }

    @Override
    public int compareTo(Object o) { // Este orden se aplica a lista de objetos tipo Jedi
        return this.nombre.compareTo(((Jedi)o).nombre);
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        if (fuerza>10) {
            System.out.println("\nERROR en "+this.nombre+". La fuerza no puede ser mayor a 10.");
            fuerza = 1;
        }
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

    public static String[] getBloqueados() {
        return Jedi.bloqueados;
    }

    public static void setBloqueados(String[] bloqueados) {
        Jedi.bloqueados = bloqueados;
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
