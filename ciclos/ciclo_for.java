/*El ciclo For
 *   for (inicialization  ;  condition ;  aument or decrement){
 *      instrucciones;
 *   }
 */
package ciclos;

import java.util.Scanner;

public class ciclo_for {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int contador;

        System.out.println("Digite cantidad de terminos: ");
        contador=entrada.nextInt();

        for(int i=2; i<=contador; i+=2){
            System.out.println(i);
        }

    }
    
}
