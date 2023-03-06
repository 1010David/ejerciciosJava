/*Leer 50 elementos numericos que se introduciran ordenados de forma creciente,
 Se guardaran en una tabla de 10 de tamaño .Leer un numero n , e insertartlo en el 
 arreglo en la posicion correspondiente.*/
package arreglos;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = true;
        int numero,sitio=0,j=0;

        System.out.println("Llenar arreglo");
        do{
            //llenando el arreglo
            for(int i=0; i<5;i++){
                System.out.print((i+1)+". Digite un numero: ");
                arreglo[i] = entrada.nextInt();
            }
            //comprovar si esta em orden creciente
            for(int i=0; i<4; i++){
                if(arreglo[i] < arreglo[i+1]){
                    creciente=true;
                }
                if(arreglo[i] > arreglo[i+1]){
                    creciente=false;
                    break;
                }
            }
            if(creciente == false){
                System.out.println("\nEl arreglo no esta en forma creciente, vuelve a digitarlo: ");
                
            }
        }while(creciente == false);

        System.out.print("\nDigite el elemento a insertar: ");
        numero = entrada.nextInt();

        //para ver en que posicion va---
        while(arreglo[j]<numero && j<5){
            sitio++;
            j++;
        }
        //Por ultimo, trasladamos una posicion en el arreglo a los elementos que van detras del numero
        for(int i=4; i>=sitio; i--){
            arreglo[i+1] = arreglo[i];
        }
        //insertamos el numero
        arreglo[sitio] = numero;
        System.out.println("\nEl arreglo queda: ");
        for(int i=0; i<6; i++){
            System.out.println(arreglo[i]+" - ");
        }
        System.out.println();

    }

    
    
}
