/*Leer por teclado una serie de 10 numeros enteros. La aplicacion
debe indicarnos si estan ordenados creciente o decrecientemente, o si estan desordenados*/
package arreglos;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int arreglo [] = new int[10]; //Creamos el arreglo de 10 elementos
        boolean creciente=false, decreciente=false;

        System.out.println("Llenar arreglo");
        for(int i=0; i<10; i++){
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        for(int i=0; i<9; i++){
            if(arreglo[i] < arreglo[i+1]){ //creciente 12345...
                creciente = true;
        
            

            }
            if(arreglo[i] < arreglo[i+1]){ //Decreciente 5432...
                decreciente = true;

            }
        }
        if(creciente = true && decreciente == false){
            System.out.println("\nEl arreglo esta en forma creciente");
        }
        else if(creciente==false && decreciente==true){
            System.out.println("\nEl arreglo esta en decreciente.");
        }
        else if(creciente ==false && decreciente == false){
            System.out.println("Todos los numeros son iguales");
        }





    }
    
}
