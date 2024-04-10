
package Comparator;

import java.util.Comparator;
import Proyecto.*;

/**
 *
 * @author 1daw05
 */
public class comparaFuerza implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return (int)((Jedi)o1).getFuerza()-(int)((Jedi)o2).getFuerza();
    }
    
}
