package com.solucionfactible.dev;

import java.util.Scanner;

/**
 * isValid allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
 * If the function is passed a valid PIN string, return true, else return false.
 * 
 * @author developer
 */
public class ValidatePIN {
	
	public static void main(String[] args) {
            
            
		       boolean entradaNumerica = true;
                       
        String entradaTeclado ="";
        //aquui pido que ingresen el pin
        System.out.print ("Introduzca un pin de 3 o 6 dígitos : ");
        Scanner entradaEscaner = new Scanner(System.in);
        entradaTeclado = entradaEscaner.nextLine (); 
        System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\" ... análisis de longitud");   
        // aqui compare que si la entrada era nayor o igual que tres y menor o igual que 6
        if ((entradaTeclado.length() >= 3)&& (entradaTeclado.length() <= 6)) {
            //si se cumplia con la condicion era un pin valido 
            System.out.println ("pin valido");
            //de lo contrario era un pin invalido
        } else { System.out.println ("pin falso");}

       

        System.out.println ("Proceso de análisis terminó");
        
    
	}

}
