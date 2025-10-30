//ARATH👍
package eva2_30_triangulo;

import java.util.Scanner;

public class EVA2_30_TRIANGULO {

    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        int valor;
        System.out.print("Elija un Valor:  ");
        valor = captu.nextInt();
        for (int i = 1; i <= valor; i++){
            for (int f = 1; f <= i; f++){
                System.out.print("*");
            }
            System.out.println();
            }
            
           
    }
    
}

