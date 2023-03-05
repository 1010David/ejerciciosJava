/*Leer un numero y dar su cuadrado,repetir el proceso hasta que sea un numero negativo. */
package ciclos;

import javax.swing.JOptionPane;

public class ejercicio4 {

    public static void main(String[] args){

        int numero,cuadrado;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un nuemro: "));

            while(numero >=0){
                cuadrado = (int)Math.pow(numero,2);

                JOptionPane.showMessageDialog(null,"El numero "+numero+" elevado al cuadrado es "+cuadrado);
                numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un nuemro: "));
   
            }
    }
    
}
