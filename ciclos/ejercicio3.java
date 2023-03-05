/*Leer numero hasta que se introduzca un cero. Para cada uno indicar si es par o inpar. */
package ciclos;

import javax.swing.JOptionPane;

public class ejercicio3 {
    public static void main(String[] args){

        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
         while(numero != 0){
            if(numero %2 == 0){
                JOptionPane.showMessageDialog(null, "El numero "+numero+" es par");
            }
            else{
                JOptionPane.showMessageDialog(null, "El numero "+numero+" es impar");
            }

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
         }


    }
    
}
