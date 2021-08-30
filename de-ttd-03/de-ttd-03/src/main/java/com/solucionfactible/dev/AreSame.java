package com.solucionfactible.dev;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * comp checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, 
 * here, that the elements in b are the elements in a squared, regardless of the order.
 * 
 * @author developer
 */
public class AreSame {
	
	 public static void main(String[] args) {
		//mando a llamar la funcion para escanear el teclado
            Scanner entrada = new Scanner(System.in);
            //declaro mis matrises y las otras variables
    int matriz[][] ,nFilas,nCol;
    //pido el numero de filas y el numero de columnas de la matrizz
    nFilas = Integer.parseInt(JOptionPane.showInputDialog("digite el numero de filas"));
    nCol = Integer.parseInt(JOptionPane.showInputDialog("digite el numero de columnas"));
    matriz = new int[nFilas][nCol];
    //ingreso los valores de la matriz
    System.out.println("digite la matriz");
    //recorro las filas y las columnas con estos ciclos
     for(int i=0; i<nFilas; i++){
         for(int j=0; j<nCol; j++){
             //imprimi el resultado
               System.out.print("Matriz[" + i + "]" + "[" +j + "] :");
               matriz[i][j] = entrada.nextInt();
         }
     }
        System.out.println("\n LA MATRIZ ES:");
        //ciclos  para extraer los datos y compararos
        for(int i=0; i<nFilas; i++){
         for(int j=0; j<nCol; j++){
             //imprimo el resultado
             System.out.print(matriz[i][j] + " ");
         }
         System.out.println("");
           
        
         }
     
               
                System.out.println("\n el cuadrado de cada elemento de la matriz es:");
                //vuelvo a hacer dos ciclos para recorrer toda la matriz
        for(int i=0; i<nFilas; i++){
        
         for(int j=0; j<nCol; j++){
              //imprimo y ago la  operacion para elevar al cuadado cada elemento de la matriz
               System.out.println(Math.pow(matriz[i][j], 2) ); 
         }  
         System.out.println("");
         
         }
            
	}

      
        
}
