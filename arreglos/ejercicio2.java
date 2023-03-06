/*Leer los numeros por teclado, alamacenarlos en un arreglo y a continuacion realizar la media de los numeros
 * positivos, y la media de los negativos. Contar el numero de ceros.*/
package arreglos;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        float numeros[] = new float[5];
        float suma_p=0, suma_n=0, m_p, m_n;
        int cont_p=0,cont_n=0, cont_c=0;

        System.out.println("Guardando los numeros en el arreglo");
        for(int i=0; i<5; i++){
            System.out.print((i+1)+". Digite un numero");
            numeros[i] = entrada.nextFloat();

            if(numeros[i]  ==0){
                cont_c++;
            }else if(numeros[i] >0){
                suma_p += numeros[i];
                cont_p++;
            }
            else{
                suma_n += numeros[i];
                cont_n++;
            }
        }
        //media positivos
        if(cont_p == 0){
            System.out.println("no se puede sacar media positivos");
        }
        else {
            m_p = suma_p / cont_p;
            System.out.println("La media de positivos es: "+m_p);

        }
        //media negativos
        if(cont_n == 0){
            System.out.println("no se puede sacar media negativos");
        }
        else {
            m_n = suma_n / cont_n;
            System.out.println("La media de negativos es: "+m_n);
        }
        System.out.println("La cantidad de ceros es: "+cont_c);

    }
    
}
