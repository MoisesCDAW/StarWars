/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

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
    private String ladoFuerza; // Lado oscuro o el de la luz
    
    
    // Constructor
    Jedi(String nombre, int fuerza, int midiclorianos, String ladoFuerza){
        setNombre(nombre);
        setFuerza(fuerza);
        
        this.estado = ESTADO.VIVO;
        
        if (midiclorianos<1) {
            System.out.println("Se ingresó una cantidad errónea de midiclorianos.");
            this.midiclorianos = 1;
        }else{this.midiclorianos = midiclorianos;}
        
        this.pareja = "Sin pareja";
        setLadoFuerza(ladoFuerza);
        
    }
    
    
    // Métodos
    public String presentarse(){ // PENDIENTE
        return "";
    }
    
    public void enamorarse(String pareja){ // PENDIENTE
        
    }
    
    public void bloquear(Jedi jedi){ // PENDIENTE
    
    }
    
    @Override 
    public String toString(){ // PENDIENTE
        return "";
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

    public String getLadoFuerza() {
        return ladoFuerza;
    }

    public void setLadoFuerza(String ladoFuerza) {
        this.ladoFuerza = ladoFuerza;
    }
}
