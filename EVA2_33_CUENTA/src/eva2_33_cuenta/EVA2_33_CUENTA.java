//ARATH👍
package eva2_33_cuenta;

import java.util.Scanner;

public class EVA2_33_CUENTA {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        double saldo = 1000000;
        double retiro;

        while (saldo > 0) {
            System.out.println("Saldo actual: $" + saldo);
            System.out.print("¿Cuanto deseas retirar? ");
            retiro = captu.nextDouble();

            saldo -= retiro;

            if (saldo < 0) {
                System.out.println("️ Has quedado en numeros rojos ($" + saldo + ")");
                break;
            } else if (saldo == 0) {
                System.out.println("Tu cuenta se ha agotado. Saldo: $0");
                break;
            }
        }

    }
}

    
    

