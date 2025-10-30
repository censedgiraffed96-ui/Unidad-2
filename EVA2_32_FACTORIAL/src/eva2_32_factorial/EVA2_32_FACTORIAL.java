//ARATH👍
package eva2_32_factorial;

import java.util.Scanner;

public class EVA2_32_FACTORIAL {

    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        int valor, factorial=1;
        System.out.println("Elija un Valor:");
        valor = captu.nextInt();
        for(int i=1; i <= valor; i++){
            factorial= factorial *i;
        }
        System.out.println("El factorial de   " + valor + "   es: " + factorial);
    }
    
}
