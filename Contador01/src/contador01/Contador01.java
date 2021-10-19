/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author uisla
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int numero = 6;
      
      System.out.println( "Ejemplo del Cálculo del factorial de un número en Java" );
      System.out.println( "El factorial de " + numero + " es: " + factorial( numero ) );      
   }
 
   public static int factorial( int numero ) {
      int fact = 1;
      for( int i = 1; i <= numero; i++ ) {
         fact *= i;
      
        }return fact;
   } 
    
}
