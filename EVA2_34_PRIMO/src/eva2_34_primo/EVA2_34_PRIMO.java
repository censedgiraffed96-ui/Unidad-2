//ARATH👍
package eva2_34_primo;

import java.util.Scanner;

public class EVA2_34_PRIMO {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int num;
        int contador = 0;

        System.out.print("Escribe un número: ");
        num = captu.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            System.out.println(num + " es primo.");
        } else {
            System.out.println(num + " no es primo.");
        }

    }
}

