
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
    public Aprendiz(String nombre, double fuerza, int midiclorianos){
        super(nombre, fuerza, midiclorianos);
        this.maestro = "Sin maestro";
    }
    
    // Métodos
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
        return super.toString()+String.format("\nMaestro: %s\nFuerza Despierta? %s\n", this.getMaestro(), this.isDespertarFuerza());
    }
    
    @Override
    public boolean equals(Object o){
        Aprendiz otroAprendiz = (Aprendiz)o;
        return super.equals(otroAprendiz) &&
            this.maestro.equals(otroAprendiz.maestro) &&
            this.despertarFuerza==otroAprendiz.despertarFuerza;
    }

    @Override
    public int compareTo(Object o) { // Este orden se aplica a lista de objetos tipo Aprendiz
        return this.getNombre().compareTo(((Aprendiz)o).getNombre());
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
