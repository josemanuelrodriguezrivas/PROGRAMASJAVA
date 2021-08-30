package com.solucionfactible.dev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * diff subtracts one list from another and returns the result.
 * It should remove all values from list a, which are present in list b keeping their order.
 * 
 * @author developer
 */
public class ArrayDiff {
	
	public static void main(String[] args) {
          double res = 0;
          
//declare estos arrays ist para contener los datos de tipo double
   List<Double> t = new ArrayList<Double>();
        //agrego los datos tipo double
        t.add(10.0);
        t.add(11.0);
        t.add(20.8);
        t.add(20.9);
        t.add(20.1);
        t.add(20.1);
        t.add(20.5);
        t.add(20.6);
        t.add(20.7);
        
        //vuelvo a declarar otro arrayst list para contener datos de tipo double
         List<Double> a = new ArrayList<Double>();
         //agrrego los datos tipo double
        a.add(20.5);
        a.add(11.0);
        a.add(20.8);
        a.add(29.9);
        a.add(22.1);
        a.add(30.1);
        a.add(30.5);
        a.add(20.6);
        a.add(20.7);
        //los mando a llamar
       List<Double> similar = new ArrayList<Double>( t );
       List<Double> different = new ArrayList<Double>(a);
       
       different.addAll( t );
       different.addAll( a );
 
       similar.retainAll( t );
       //los remuevo
       different.removeAll( similar );
       ///imprimo los valores de las listas, los elementos similares y los elementos diferentes
       System.out.printf("lista a:%s%n lista b:%s%nSimilares:%s%nDifferentes:%s%n", t, a, similar, different);
	}

}
