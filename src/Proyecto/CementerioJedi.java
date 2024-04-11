
package Proyecto;
import java.util.*;
import java.time.LocalDateTime;

/**
 * <h2> La cual almacena la fecha y hora del fin del combate, 
 * el nombre del perdedor y del ganador</h2>
 * @version 4.2024
 * @author Moisés Campos
 * @since 11-04-2024
 */
public class CementerioJedi{
    
    /**
     * Una lista para poder almacenar la fecha y la hora del fin del combate
     */
    private LocalDateTime[] Fecha={};
    /**
     * Una lista para guardar a los perdedores del combate. Almacena solo los
     * nombres de los personajes
     */
    private String[] JediRip={};
    /**
     * Una lista de los verdugos ganadores del combate. Almacena solo los
     * nombres de los personajes
     */
    private String[] Verdugo={};
    
    
    // Método
    
    /**
     * Para obtener un número aleatorio y luego usar este valor en los combates
     * @return Número aleatorio de entre 1 y 6
     */
    private int dados(){
        return (int)((Math.random()*6)+1);
    }
    
    /**
     * realiza un combate entre personajes donde se le suma un valor "número dado" 
     * por el método dado() a la fuerza de los personajes. El que tenga más fuerza gana
     * @param jedi1
     * @param jedi2
     * @return Resultados del combate
     */
    public String combate(Jedi jedi1, Jedi jedi2){
        double puntuaJedi1 = dados() + jedi1.getFuerza();
        double puntuaJedi2 = dados() + jedi2.getFuerza();
        
        if (puntuaJedi1==puntuaJedi2) {
            return "Hubo un empate en este combate!";
        }else{
            Fecha = Arrays.copyOf(Fecha, Fecha.length+1);
            Fecha[Fecha.length-1] = LocalDateTime.now();
            
            JediRip = Arrays.copyOf(JediRip, JediRip.length+1);
            Verdugo = Arrays.copyOf(Verdugo, Verdugo.length+1);  
        }
        
        if (puntuaJedi1>puntuaJedi2) {
            JediRip[JediRip.length-1] = jedi2.getNombre();
            Verdugo[Verdugo.length-1] = jedi1.getNombre();
            return "El ganador es: "+jedi1.getNombre();  
            
        }else{
            JediRip[JediRip.length-1] = jedi1.getNombre();
            Verdugo[Verdugo.length-1] = jedi2.getNombre();
            return "El ganador es: "+jedi2.getNombre();
        }      
    }
    
    /**
     * Sobrescritura del método toString() para mostrar los atributos del cementerio
     * @return Descripción del objeto de la clase
     */
    @Override
    public String toString(){
        return "DETALLES DEL CEMENTERIO\n"+"Fechas: "+Arrays.toString(Fecha)+"\nJedis muertos: "+Arrays.toString(JediRip)+"\nVerdugos: "+Arrays.toString(Verdugo);
    }
    
    
}
