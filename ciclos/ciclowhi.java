/*El ciclo WHILE se ejecuta mientras la instruccion sea verdadera */
package ciclos;

import java.util.Scanner;

public class ciclowhi {
    public static void main(String[] args){

        
        /*int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        int e=10;
        while(e>=1){
            System.out.println(e);
            e--;
        }*/
        Scanner entrada = new Scanner(System.in);
        int i=1,contador;

        System.out.println("Hasta que numero imprimir: ");
        contador = entrada.nextInt();

        while(i<=contador){
            System.out.println(i);
            i++;
        }


    }
}