/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        return ((Jedi)o1).getFuerza()-((Jedi)o2).getFuerza();
    }
    
}
