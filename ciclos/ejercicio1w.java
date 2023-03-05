/*Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un numero negativo.*/
package ciclos;

import javax.swing.JOptionPane;

public class ejercicio1w {
    public static void main(String[] args){
        int numero,cuadrado;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        while(numero >= 0){
            cuadrado = (int)Math.pow(numero,2);
            
            JOptionPane.showMessageDialog(null, "El numero "+numero+" elevado al cuadrado en: "+cuadrado);

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));

        }

        
    }
    
}
