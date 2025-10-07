
package eva2_11_for;

import java.util.Scanner;


public class EVA2_11_FOR {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int rep;
        String mensaje;
        System.out.println("Mensaje a repetir");
        mensaje = captu.nextLine();
        System.out.println("Cantidad de repeticiones");
        rep = captu.nextInt ();
        for(int f = 1; f <= rep; f++){
            System.out.println(mensaje);
    }
}
}

