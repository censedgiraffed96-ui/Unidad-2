
package eva2_13_numeros__pares;

import java.util.Scanner;

public class EVA2_13_NUMEROS__PARES {

    public static void main(String[] args) {
       //3 --> 50
       int inicio,fin;
       Scanner captu = new Scanner(System.in);
        System.out.println("Inicio");
        inicio = captu.nextInt();
        System.out.println("Fin");
        fin = captu.nextInt();
        
        for(int f = inicio; f <= fin; f++){
           int res= f % 2;
           if(res ==0) 
              System.out.print(f + ",");
    }
    }
}
