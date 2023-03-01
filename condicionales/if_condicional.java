/*L sentencia if:
 * 
 * if(condicion){
 *      Instruccion1;      
 * }
 * else{
 *      Instruccion";
 * }
 */
package condicionales;

import javax.swing.JOptionPane;

public class if_condicional {
    public static void main(String[] args) {
        int numero, dato = 5;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));
        
        if (numero == dato){
            JOptionPane.showMessageDialog(null, "El numero es 5");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero es diferente");
        }
    }
    
} 