
package Proyecto;

import java.util.*;

/**
 * <h2> La cual representa a los Jedi. Personajes principales para el proyecto starWars</h2>
 * @version 4.2024
 * @author Moisés Campos
 * @since 11-04-2024
 */
public class Jedi implements Comparable{
    
    /**
     * Nombre del Jedi
     */
    private String nombre;
    /**
     * Fuerza del Jedi. Puede tener un máximo de 10 puntos
     */
    private double fuerza;
    /**
     * Estado del Jedi. Representado por un enum llamado "ESTADO", el cual puede 
     * ser VIVO o MUERTO. Por defecto se inicializa en VIVO
     */
    private ESTADO estado;
    /**
     * Número de midiclorianos que tiene un Jedi por célula. final según conceptos
     * del tema ya que un Jedi nace con ese número y no cambia
     */
    final private int midiclorianos;
    /**
     * Estado emocional del Jedi
     */
    private boolean enamorado;
    /**
     * Pareja que acompaña al Jedi
     */
    private String pareja;
    /**
     * Lista de Jedi perteneciente a la clase y no a los objetos
     */
    static String[] bloqueados = new String[0];
    /**
     * Lado de la fuerza al que pertenece el Jedi. Siendo reprensentado por un
     * enum llamado "LADOFUERZA" que puede ser LUZ u OSCURO
     */
    private LADOFUERZA ladoFuerza; // Lado oscuro o el de la luz
              
    
    /**
     * Constructor de la clase Jedi que recibe una serie de parámetros. Inicializa 
     * por defecto el atributo estado a VIVO, controla el ingreso correcto de un 
     * número midiclorianos, establece a "pareja" a "Sin pareja" y el lado de la fuerza
     * de creación será LUZ
     * @param nombre tipo String
     * @param fuerza tipo double
     * @param midiclorianos tipo int
     */
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
    
    /**
     * Muestra el contenido de algunos de los atributos del Jedi
     * @return Nombre, midiclorianos y ladoFuerza del Jedi
     */
    public String presentarse(){
        return String.format("PRESENTACIÓN DEL JEDI\nNombre: %s\nMidiclorianos: %d\nLado de la fuerza: %s\n",
                this.nombre, this.midiclorianos, this.ladoFuerza);
    }
    
    /**
     * Asigna una pareja al jedi. Asigna solo el nombre 
     * @param pareja 
     */
    public void enamorarse(Jedi pareja){
        this.pareja = pareja.nombre;
        this.enamorado = true;
    }
    
    /**
     * Bloquea a un Jedi y lo añade a la lista de bloqueados propia de la clase
     * Si el Jedi tenía pareja, pasa a estar sin pareja y enamorado será false
     * @param jedi 
     */
    public static void bloquear(Jedi jedi){
        
        Jedi.bloqueados = Arrays.copyOf(bloqueados, bloqueados.length+1);
        Jedi.bloqueados[bloqueados.length-1] = jedi.nombre;
        
        if (jedi.enamorado) {
            jedi.setEnamorado(false);
            jedi.setPareja("Sin pareja");
        }     
    }
    
    /**
     * Sobrescritura del método toString() para mostrar los atributos del Jedi
     * @return Descripción del objeto de la clase
     */
    @Override 
    public String toString(){
        return String.format("DETALLES DEL JEDI\nNombre: %s\nFuerza: %.2f\nEstado: %s\nMidiclorianos: %d\nEstá enamorado? %s\n"
                + "Pareja: %s\nLado de la fuerza: %s\n\nLISTA DE JEDI BLOQUEADOS\n%s", this.nombre, this.fuerza, this.estado,
                this.midiclorianos, this.enamorado, this.pareja, this.ladoFuerza, Arrays.toString(Jedi.bloqueados));
    }

    /**
     * Sobrescritura de equals para poder comparar objetos de la clase Jedi
     * @param o tipo Object para luego hacer un cast a Jedi
     * @return Devuelve true o false
     */
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

    /**
     * Sobrescritura de compareTo para poder ordenar objetos de la clase Jedi
     * Este orden se aplica a lista de objetos tipo Jedi
     * @param o tipo Object para luego hacer un cast a Jedi
     * @return -1, 0 o 1 para poder ordenar a los Aprendices
     */
    @Override
    public int compareTo(Object o) { // Este orden se aplica a lista de objetos tipo Jedi
        return this.nombre.compareTo(((Jedi)o).nombre);
    }    

    /**
     * Para poder mostrar el nombre del Jedi fuera de la clase local
     * @return Nombre del Jedi
     */
    public String getNombre() {
        return nombre;
    }

     /**
     * Para poder cambiar el nombre del Jedi fuera de la clase local
     * @param nombre 
     */  
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Para poder mostrar el nivel de fuerza del Jedi fuera de la clase local
     * @return Nivel de fuerza
     */  
    public double getFuerza() {
        return fuerza;
    }

    /**
     * Para poder cambiar el nivel de fuerza del Jedi fuera de la clase local
     * @param fuerza 
     */   
    public void setFuerza(double fuerza) {
        if (fuerza>10) {
            System.out.println("\nERROR en "+this.nombre+". La fuerza no puede ser mayor a 10.");
            fuerza = 1;
        }
        this.fuerza = fuerza;
    }

    /**
     * Para poder mostrar el estado del Jedi fuera de la clase local
     * @return Estado del jedi
     */   
    public ESTADO getEstado() {
        return estado;
    }

    /**
     * Para poder cambiar el estado del Jedi fuera de la clase local
     * @param estado 
     */
    public void setEstado(ESTADO estado) {
        this.estado = estado;
    }

    /**
     * Para poder mostrar el número de midiclorianos del Jedi fuera de la clase local
     * @return Número de midiclorianos
     */
    public int getMidiclorianos() {
        return midiclorianos;
    }

    /**
     * Para poder mostrar el estado emocional del Jedi fuera de la clase local
     * @return Estado emocional
     */   
    public boolean isEnamorado() {
        return enamorado;
    }

    /**
     * Para poder cambiar el estado emocional del Jedi fuera de la clase local
     * @param enamorado 
     */
    public void setEnamorado(boolean enamorado) {
        this.enamorado = enamorado;
    }

    /**
     * Para poder mostrar la lista de bloqueados
     * @return Lista de bloqueados
     */
    public static String[] getBloqueados() {
        return Jedi.bloqueados;
    }
    
    /**
     * Para poder cambiar la lista de bloqueados
     * @param bloqueados 
     */
    public static void setBloqueados(String[] bloqueados) {
        Jedi.bloqueados = bloqueados;
    }

    /**
     * Para poder mostrar el nombre de la pareja del Jedi fuera de la clase local
     * @return Nombre de la pareja
     */
    public String getPareja() {
        return pareja;
    }
    
    /**
     * Para poder cambiar el nombre del maestro fuera de la clase local
     * @param pareja 
     */
    public void setPareja(String pareja) {
        this.pareja = pareja;
    }

    /**
     * Para poder mostrar el lado de la fuerza del Jedi fuera de la clase local
     * @return Lado de la fuerza
     */   
    public LADOFUERZA getLadoFuerza() {
        return ladoFuerza;
    }

    /**
     * Para poder cambiar el lado de la fuerza del Jedi fuera de la clase local
     * @param ladoFuerza 
     */
    public void setLadoFuerza(LADOFUERZA ladoFuerza) {
        this.ladoFuerza = ladoFuerza;
    }
}
