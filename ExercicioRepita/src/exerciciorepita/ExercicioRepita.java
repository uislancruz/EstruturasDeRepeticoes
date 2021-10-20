/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import java.awt.Button;
import javax.swing.JOptionPane;

/**
 *
 * @author uisla
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Ola mundo!","Boas Vindas", JOptionPane.INFORMATION_MESSAGE);
      
        int n, s=0;
        do{
            
        n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "<html>Informe um numero: <br><em>(o valor 0 interrompe a sequencia)</em></br></html>"));
                //JOptionPane.showMessageDialog(null, "O numero que você digitou foi: " +n);
                //s +=n;
        } while (n !=0);
                JOptionPane.showMessageDialog(null,"A soma total dos numeros digitados é: " +s );
                
        }
        
    
}
