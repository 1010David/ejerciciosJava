package arreglos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class arreglo1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int nElemento;
        nElemento = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo"));

        char[] letra = new char[nElemento];

        System.out.println("Digite los elementos del arreglo: ");
        for(int i=0;i<nElemento;i++){
            System.out.println((i+1)+" Digite un caracter: ");
            letra[i] = entrada.next().charAt(0);

    
        }
        System.out.println("\nLos caracteres del arreglo son: ");
        for(int i=0; i<nElemento; i++){
            System.out.println(letra[i]);
        }

    }
    
}
