/*Programa que lea un caracter por teclado y compruebe si es letra mayuscula. */
package condicionales;

import javax.swing.JOptionPane;

public class ejercicio2 {
    public static void main(String[] args){
        char letra;

        letra = JOptionPane.showInputDialog("Digite una letra").charAt(0);

        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "Es letra mayuscula. ");
        }
        else{
            JOptionPane.showMessageDialog(null, "No es letra mayuscula. ");
        }

    }
    
}
