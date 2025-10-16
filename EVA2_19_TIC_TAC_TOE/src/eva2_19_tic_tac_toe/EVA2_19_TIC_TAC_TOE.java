
package eva2_19_tic_tac_toe;

import java.util.Scanner;

public class EVA2_19_TIC_TAC_TOE {

    public static void main(String[] args) {
        int tictac[][] = new int [3][3];
        int fila, col,jug;
        Scanner captu = new Scanner(System.in);
        for (int f = 0; f < 10; f++) {
            System.out.println("Introduce tu posición, fila:");
            fila = captu.nextInt();
            System.out.println("Introduce tu posición, columna:");
            col = captu.nextInt();
            System.out.println("Jugador (1 o 2):");
            jug = captu.nextInt();
            tictac[fila][col] = jug;
        
            for(int d = 0; d < tictac.length; d++){
              for(int e = 0; e < tictac[1].length; e ++){
             System.out.print("("+ tictac[f][e]+")");
            
        }
    }
        }      
}
}