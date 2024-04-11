
package Proyecto;

/**
 * <h2> La cual extiende de la clase Jedi. Representa a los
 * aprendices de cada Jedi</h2>
 * @version 4.2024
 * @author Moisés Campos
 * @since 11-04-2024
 */
public class Aprendiz extends Jedi implements Comparable{
    /**
     * Maestro del aprendiz, parámetro tipo String
     */
    private String maestro;
    /**
     * Marca True o False si el aprendiz ha despertado la fuerza
     */
    private boolean despertarFuerza;

    /**
     * Constructor de la clase Aprendiz con tres parámetros de la clase padre "Jedi".
     * No recibe parámetros propios de la clase Aprendiz
     * @param nombre tipo String
     * @param fuerza tipo double
     * @param midiclorianos tipo int
     */
    public Aprendiz(String nombre, double fuerza, int midiclorianos){
        super(nombre, fuerza, midiclorianos);
        this.maestro = "Sin maestro";
    }
    
    // Métodos
    
    /**
     * Entrena al aprendiz para aumentar su fuerza mediante una división de los 
     * midiclorianos entre 200.000 mil
     */
    public void entrenar(){
        double aux;
        aux = (double)this.getMidiclorianos()/200000;
        if (this.getFuerza()+aux>=10) {
            System.out.println("Este personaje ha alcanzado su fuerza máxima.");
            this.setFuerza(10);
        }else{
            System.out.println("Entreno hecho!");
            this.setFuerza(this.getFuerza() + aux);          
        }
    }
    
    /**
     * Para declarar el nombre del maestro Jedi del aprendiz
     * Se le pasa un parámetro tipo Object para luego hacer un "cast" a Jedi y 
     * seleccionar el nombre
     * @param o tipo Object
     */
    public void elegirMaestro(Object o){
        this.setMaestro(((Jedi)o).getNombre());
    }
    
    /**
     * Pasar a true el atributo despertarFuerza de aprendiz
     * Marca también un mensaje si el atributo ya está en true
     */
    public void despiertaFuerza(){
        if (isDespertarFuerza()) {
            System.out.println("Este personaje ya ha despertado la fuerza.");
        }else{
            System.out.println("Fuerza despertada!");
            this.setDespertarFuerza(true);
        }
    }
    
    /**
     * Sobrescritura del método toString() para mostrar los atributos del Aprendiz
     * @return Descripción del objeto de la clase
     */
    @Override
    public String toString(){
        return super.toString()+String.format("\nMaestro: %s\nFuerza Despierta? %s\n", this.getMaestro(), this.isDespertarFuerza());
    }
    
    /**
     * Sobrescritura de equals para poder comparar objetos de la clase Aprendiz
     * @param o tipo Object para luego hacer un cast a Aprendiz
     * @return Devuelve true o false
     */
    @Override
    public boolean equals(Object o){
        Aprendiz otroAprendiz = (Aprendiz)o;
        return super.equals(otroAprendiz) &&
            this.maestro.equals(otroAprendiz.maestro) &&
            this.despertarFuerza==otroAprendiz.despertarFuerza;
    }

    /**
     * Sobrescritura de compareTo para poder ordenar objetos de la clase Aprendiz
     * Este orden se aplica a lista de objetos tipo Aprendiz
     * @param o tipo Object para luego hacer un cast a Aprendiz
     * @return -1, 0 o 1 para poder ordenar a los Aprendices
     */
    @Override
    public int compareTo(Object o) {
        return this.getNombre().compareTo(((Aprendiz)o).getNombre());
    }
    
    /**
     * Para poder mostrar el nombre del maestro fuera de la clase local
     * @return Nombre del maestro
     */
    public String getMaestro() {
        return maestro;
    }
    
    /**
     * Para poder cambiar el nombre del maestro fuera de la clase local
     * @param maestro 
     */
    public void setMaestro(String maestro) {
        this.maestro = maestro;
    }

    /**
     * Para mostrar el valor del atributo despertarFuerza fuera de la clase local
     * @return Estado del atributo despertarFuerza
     */
    public boolean isDespertarFuerza() {
        return despertarFuerza;
    }

    /**
     * Para poder cambiar el estado del atributo fuera de la clase local
     * @param despertarFuerza 
     */
    public void setDespertarFuerza(boolean despertarFuerza) {
        this.despertarFuerza = despertarFuerza;
    }
    
}
