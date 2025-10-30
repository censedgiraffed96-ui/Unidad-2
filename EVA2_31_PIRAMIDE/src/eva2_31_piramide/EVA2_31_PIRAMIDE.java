//ARATH👍
package eva2_31_piramide;

import java.util.Scanner;

public class EVA2_31_PIRAMIDE {

    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        int valor;
        System.out.print("Elija un Valor");
        valor = captu.nextInt();
        for (int i = 1; i <= valor; i++){
            for (int f = 1; f <= i; f++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = valor; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
        }
         System.out.println(); 
        }
    }
}
