/*Leer 5 numeros.guardarlos en un arreglo y mostrarlos em el orden. */
package arreglos;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float numeros[] =new float[5];

        System.out.println("Guardando los datos en el arreglo");
        for(int i=0; i<5; i++){ //se cambia ++ por -- para mostrar invertidos
            System.out.print((i+1)+". Digite un numero: ");

            numeros[i] = entrada.nextFloat();

        }
        System.out.println("\nImprimir los elementos del arreglo");
        for(float i:numeros){
            System.out.println(i);
        }

    }
    
}
