package com.solucionfactible.dev;

import javax.swing.JOptionPane;

/**
 * persistence takes in a positive parameter num and returns its multiplicative persistence, which is the number 
 * of times you must multiply the digits in num until you reach a single digit.
 * 
 * @author developer
 */
public class Persistence {
	
	     public static void main(String[] args) {
                 //declaro las variables que voy a necesitar
		int numero =0; 
                //declaro el contador y lo igualo a 0 
        int contador = 0;
        //pido el numero
        numero = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
        //mientras que numero ingresadoo sea menor a 9
        while( numero > 9){
            //declaro esta variable que es la que se va a encargar de multiplicar
            int multi = 1;
            // ago otro ciclo comparando mientras numero sea diferente o igual a 0
            while (numero != 0){
                //ago el calculo
                int digitos = numero % 10;
                multi = multi * digitos;
                numero = ((numero - digitos) / 10);
                
            }
            //contador va aser igual a lo que ya tengo +1
            contador = contador + 1;
            System.out.println (multi);
            //igualo el numero ala multiplicaciom
            numero = multi;
            //imprimo el resultado
            System.out.println("la percistencia es ; " + contador );
        
        }
          
	}

}
