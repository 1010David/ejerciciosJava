/*Construir un programa que simule una calculadora con las cuatro operaciones basicas.
 * El usuario especifica la operiacion mediante la inicial de cada operacion: Ss, Rr, Mm, Dd.
 */
package condicionales;

import javax.swing.JOptionPane;

public class ejercicio6 {
    public static void main(String[] args) {

        int n1, n2;
        char operacion;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        operacion = JOptionPane.showInputDialog("Digite la inicial del a operacion: ").charAt(0);

        int suma;
        int resta;
        int producto;
        int division;
        switch (operacion) {
            case 's':
            case 'S':
                suma = n1 + n2;
                JOptionPane.showMessageDialog(null, "La suma es: " +suma);
                break;
            case 'r':
            case 'R':
                resta = n1 - n2;
                JOptionPane.showMessageDialog(null, "La suma es: " +resta);
                break;

            case 'm':
            case 'M':
                producto = n1 * n2;
                JOptionPane.showMessageDialog(null, "La suma es: " +producto);
                break;

            case 'd':
            case 'D':
                division = n1 / n2;
                JOptionPane.showMessageDialog(null, "La suma es: " +division);
                break;

            default: JOptionPane.showMessageDialog(null, "Error");

        }

    }

}
