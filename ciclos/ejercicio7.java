/*Pedir un numero y calcular su factoral.  N!=1*2*3...*N. */
package ciclos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejercicio7 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
         long numero,facto=1;
         numero = Long.parseLong(JOptionPane.showInputDialog("Digite el numero: "));

         for(int i=1; i<=numero; i++){
            facto*=i;

         }
         JOptionPane.showMessageDialog(null, "El factorial es: "+facto);


    }
    
}
