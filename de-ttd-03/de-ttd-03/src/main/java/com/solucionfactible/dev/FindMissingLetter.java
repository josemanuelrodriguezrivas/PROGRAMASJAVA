package com.solucionfactible.dev;

import javax.swing.JOptionPane;


/**
 * findMissingLetter takes an array of consecutive (increasing) letters as input and that returns the missing letter 
 * in the array. You will always get an valid array. And it will be always exactly one letter be missing. 
 * The length of the array will always be at least 2.The array will always contain letters in only one case.
 * (Use the English alphabet with 26 letters)
 * 
 * @author developer
 */
public class FindMissingLetter {
	
	 public static void main(String[] args) {
             //aqui lo primero que hise fue declarar los arrays con sus respectivos valosre
          char [] num  = new char [25];
        char [] s = new char[25];
             char [] res = {
'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
             char [] n= {
'a','b','c','d','e','f','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
                 //imprimi el primerarrays  
             System.out.print("abecedario ingles");
                    System.out.print("\n");  
             for(int i = 0; i < res.length; i++){  
          
    System.out.print(res[i]+ " "); 
 
}
      System.out.print("\n");        
        //imprimi el arrays que se va a comparar con el abecedario
  System.out.print("elementos matriz a"); 
       System.out.print("\n");
       //hise un ciclo para rrecorrer el arreglo y asi extraer sus datos
   for(int i = 0; i < n.length; i++){  
          
    System.out.print(n[i]+ " "); 
  System.out.print("\n");
  

    
}
  
   System.out.print("elemento faltante");
   //aqui lo que hise fue recorrer los dos arrays con 2 ciclos 
    for(int i = 0; i < res.length; i++){
        int count =0;
        for(int j = 0; j < n.length; j++){  
           // despues compare si  el arrays de n era diferente o igual que la matriz del abecedario
               if(n[j] != res[i]){
                   //y si lo era imprimia la letra faltante
                System.out.println(n[j] + "\n " + "elemento faltante");
             //el break lo use para que cuando rrecorrira el arrays comparandolo y llegando ala letra faltante se detuviera
              break; 
                
            
            }else{
                   System.out.println("no falta ningun elemento");
               }
         
                 
            
        }
    
       
        
              
          }
     
    }
    


    
}
