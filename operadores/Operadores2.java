/*Contruir un programa que, dado un numero total de horas, devuelve el numero de semanas, 
dias y horas equivalentes. Por ejemplo, dado un total de 1000 horas, debe mostrarv 5 semanas, 
6 dias y 16 horas. */
package operadores;

import java.util.Scanner;

public class Operadores2 {
    public static void main(String[] args){
        Scanner entrado = new Scanner(System.in);
        int t,s,d,h;

        System.out.println("Digite las horas: ");
        t = entrado.nextInt();

        s = t / 168;
        d = t%168 / 24;
        h = t%24;
        
        System.out.println("\nEl equivalente es: ");
        System.out.println("Semanas: "+s);
        System.out.println("Dias: "+d);
        System.out.println("Horas: "+h);


    }

    
}
