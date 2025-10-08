
package eva2_12_tabla_mult;

import java.util.Scanner;

public class EVA2_12_TABLA_MULT {

    public static void main(String[] args) {
        int v;
        Scanner captu = new Scanner(System.in);
        System.out.print("Tabla de multiplicar");
        v = captu.nextInt();
        for(int f = 1; f <= 10; f++){
            int mult = v * f;
            System.out.println(v + "x" + f + "=" + mult);
        }
    } 
}
