/*Peditr dia,mes y año de una fecha e indicar si es correcta la fecha. Suponiendo que todos 
los meses son 30 dias. */
package condicionales;

import javax.swing.JOptionPane;

public class ejercicio5 {
    public static void main(String[] args){

        int day,month,year;

        day = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        month = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        year = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));

        if((day >=1) && (day<=30)){
            if((month>1)  &&  (month<=12)){
                if(year != 0){
                    JOptionPane.showMessageDialog(null, "Fecha correcta");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Fecha incorrecta, error año");
                }

            }
            else{
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, error mes");
            }

        }
        else{
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, error dia");
        }


    }
    
}
