/* La calificaciòn final de una estudiante de informatica se calcula con base
 * en las calificaciones de cuatro aspectos de su rendimiento acadèmico, participacion, 
 * primer parcial, segundo parcial y examen fianl. Sabiendo que las calificaciones 
 * anteriores entran a la calificacion final con porcentajes de 10%,25% y 40%. Hacer un programa
 * que calcule e imprima la nota final de un estudiante.
 */
 package operadores;

import java.util.Scanner;

public class Operadores1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float p,pp,sp,ef,nf;

        System.out.println("Digite la nota p");
        p = entrada.nextFloat();
        System.out.println("Digite la nota pp");
        pp = entrada.nextFloat();
        System.out.println("Digite la nota sp");
        sp = entrada.nextFloat();
        System.out.println("Digite la nota ef");
        ef = entrada.nextFloat();


        p *= 0.10f;
        pp *= 0.25f;
        sp *= 0.25f;
        ef *= 0.40f;

        nf = p+pp+sp+ef;
        System.out.println("\nFinal Note: "+nf);

        
    }

}
