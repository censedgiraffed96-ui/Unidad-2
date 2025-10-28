//ARATH👍
package eva2_25_adivinar_numero;

import java.util.Scanner;

public class EVA2_25_ADIVINAR_NUMERO {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int valor, adivinar;
        do{
            adivinar = (int)(Math.random()*5);
            System.out.println("Adivina el numero, -1 para terminar.");
            valor= captu.nextInt();
            if (valor == adivinar);
               System.out.println("Adivinaste!!!!");
         }while(valor != -1);//condicion para repetir (true)
        }
}
