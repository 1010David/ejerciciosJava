/*Programa que lea un numero entero y muestre si el numero es multiplo de 10. */
package condicionales;

import javax.swing.JOptionPane;

public class ejercicio1 {
    public static void main(String[] args){
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero"));

        if(numero%10 == 0 && numero !=0){
            JOptionPane.showMessageDialog(null, "El numero "+numero+" es multiplo de 10.");
        
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero no es multiplo de 10.");
        }



    }
    
}
