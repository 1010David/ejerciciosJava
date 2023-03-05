/*Leer un numero e indicar si es positivo o negativo. El proceso se repetira hasta que se introduzca un cero. */
package ciclos;

import javax.swing.JOptionPane;

public class ejercicio2w {
    public static void main(String[] args){

        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        while(numero!=0){
            if(numero>=0){
                JOptionPane.showMessageDialog(null, "El numero "+numero+" es positivo.");
            }
            else{
                JOptionPane.showMessageDialog(null, "El numero "+numero+" es negativo");

            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            
        }
        

    }
    
}
