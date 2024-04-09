/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author moise
 */
public class Aprendiz extends Jedi implements Comparable{
    // Atributos
    private String maestro;
    private boolean despertarFuerza;
    
    // Constructor
    public Aprendiz(String nombre, int fuerza, int midiclorianos, String ladoFuerza, String Maestro){
        super(nombre, fuerza, midiclorianos, ladoFuerza);
        this.maestro = "Sin maestro";
    }
    
    // Métodos
    public void entrenar(){
        double aux;
        aux = this.getMidiclorianos()/200000;
        if (this.getFuerza()+aux>=10) {
            System.out.println("Este personaje ha alcanzado su fuerza máxima.");
            this.setFuerza(10);
        }else{
            System.out.println("Entreno hecho!");
            this.setFuerza((int) (this.getFuerza() + aux));
        }
    }
    
    public void elegirMaestro(Object o){
        this.setMaestro(((Jedi)o).getNombre());
    }
    
    public void despiertaFuerza(){
        if (isDespertarFuerza()) {
            System.out.println("Este personaje ya ha despertado la fuerza.");
        }else{
            System.out.println("Fuerza despertada!");
            this.setDespertarFuerza(true);
        }
    }
    
    @Override
    public String toString(){
        return super.toString()+String.format("Maestro: %s\nFuerza Despierta? %s\n", this.getMaestro(), this.isDespertarFuerza());
    }
    
    @Override
    public boolean equals(Object o){ // PENDIENTE
        return true;
    }

    @Override
    public int compareTo(Object o) { // PENDIENTE
        return 1;
    }

    public String getMaestro() {
        return maestro;
    }

    public void setMaestro(String maestro) {
        this.maestro = maestro;
    }

    public boolean isDespertarFuerza() {
        return despertarFuerza;
    }

    public void setDespertarFuerza(boolean despertarFuerza) {
        this.despertarFuerza = despertarFuerza;
    }
    
}
