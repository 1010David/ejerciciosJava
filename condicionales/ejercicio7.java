/*Hcer un programa que simule un cajero automatico con un saldo inicial de 1000 Dolares, 
con el sigioente menu: 1.Ingresas  dinero a la cuenta 2.Retirar dinero 3.Salir. */
package condicionales;

import javax.swing.JOptionPane;

public class ejercicio7 {
    public static void main(String[] args) {
        final int saldoIni = 1000;
        int opcion;
        float ingreso, saldoAct, retiro;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero!\n"
                + "1.Ingresar dinero\n"
                + "2.Retirar dinero\n"
                + "3.Salir"));

        switch (opcion) {
            case 1:
                ingreso = Float.parseFloat(JOptionPane.showInputDialog("Cantidad a ingresar: "));
                saldoAct = saldoIni + ingreso;
                JOptionPane.showMessageDialog(null, "Dinero en cuenta: " + saldoAct);
                break;
            case 2:
                retiro = Float.parseFloat(JOptionPane.showInputDialog("Cantidad a retirar: "));

                if(retiro > saldoIni){
                    JOptionPane.showMessageDialog(null, "Saldo insufucuente!");

                }
                else{
                    saldoAct = saldoIni - retiro;
                    JOptionPane.showMessageDialog(null, "Dinero en cuenta: "+saldoAct);
                    
                }
                break;

            case 3:
                break;

            default: JOptionPane.showMessageDialog(null, "Error");
                break;

        }

    }

}
