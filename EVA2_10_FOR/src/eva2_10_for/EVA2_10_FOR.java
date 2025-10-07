
package eva2_10_for;

import java.util.Scanner;

public class EVA2_10_FOR {

    public static void main(String[] args) {
        //imprimir del 1 al 20
        for(int f = 1; f <= 20; f++){
            System.out.print(f + "-");
        }
        //imprimir al reves
        System.out.print("");
        for(int f = 20; f >= 1; f--){
        System.out.print(f + "-");
        }
        //imprimir los pares de 0 a 100
        //0 - 2 - 3 - 4 - 5.... 90 - 100
        System.out.print("");
        //+=, -=, *=, /=
        for(int f = 0; f <= 100;f+=2){
            System.out.print(f + "-");
        }
        //imprimir al orden inverso
        for(int f = 100; f >= 0;f-=2){
            System.out.print(f + "-");
            //solicitar al usuario 2 numeros, imprimir la litsa
            //entre esos numeros
            //-3 y 3 --> -3 -2 -1 o 1 2 3
            //en orden inverso
        }
        System.out.println("");
        
        int n,m;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        n = captu.nextInt();
        System.out.println("introduzca el segundo numero");
        m = captu.nextInt();
        for(int f = n; f <= m; f++){
            System.out.print(f + "-");
        }
         System.out.println("");
        for(int f = m; f >= n; f--){
            System.out.print(f + "-");
        }
    }
}

