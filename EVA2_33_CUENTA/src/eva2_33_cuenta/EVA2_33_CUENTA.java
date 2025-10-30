//ARATH👍
package eva2_33_cuenta;

import java.util.Scanner;

public class EVA2_33_CUENTA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1_000_000;
        double retiro;

        while (saldo > 0) {
            System.out.println("Saldo actual: $" + saldo);
            System.out.print("¿Cuánto deseas retirar? ");
            retiro = sc.nextDouble();

            saldo -= retiro;

            if (saldo < 0) {
                System.out.println("⚠️ Has quedado en números rojos ($" + saldo + ")");
                break;
            } else if (saldo == 0) {
                System.out.println("Tu cuenta se ha agotado. Saldo: $0");
                break;
            }
        }

        sc.close();
    }
}

    
    

