package arreglos;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int arreglo[] = new int[10]; //crear arreglo
        int aux;
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Digite:");
            arreglo[i] = in.nextInt();
        }
        aux = arreglo[9]; //guardar ultimo elemento 
        for (int i = 8; i >= 0; i--) { //avanzar una posicion en el arreglo

            arreglo[i + 1] = arreglo[i];
        }
        arreglo[0] = aux;

        System.out.println("El nuevo arreglo es : ");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". Numero:" + arreglo[i]);
        }

    }

}
