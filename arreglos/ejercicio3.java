/*Leer por teclado dos tablas de diez numeros y organixarlas en una tercera tabla asi:
 * a1 b1, a2 b2, c1 c2 etc */
package arreglos;

import java.util.Scanner;

public class ejercicio3{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int a[],b[],c[];

        a = new int[10];
        b = new int[10];
        c = new int[20];
         
        //pedir arreglo a
        System.out.println("Digite primer arreglo: ");
        for(int i=0; i<10; i++){
            System.out.print((i+1)+". Digite un numero: ");
            a[i] = entrada.nextInt();
        }
        //pedir arreglo b
        System.out.println("\nDigite segundo arreglo: ");
        for(int i=0; i<10; i++){
            System.out.print((i+1)+". Digite un numero: ");
            b[i] = entrada.nextInt();
        }
        //unir arreglo en c
        //iterador i para a y b. j para c.
        int j=0;
        for(int i=0; i<10; i++){
            c[j] = a[i]; //1 a
            j++;
            c[j] = b[i];//1b
            j++;


        }
        System.out.print("\nEl tercer arreglo es: ");
        for(int i=0; i<20; i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();

    }

}