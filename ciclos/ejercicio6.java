/*Diseñar un prgrama que muestre el producto de los 10 numero impares primeros.*/
package ciclos;

public class ejercicio6 {
    public static void main(String[] args){
        long producto = 1; 

        for(int i=1; i<=20; i+=2){
            producto  *= i;

        }
        System.out.println("El producto es: "+producto);
        

    }
    

}
