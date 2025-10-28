
package eva2_28_buscar;

import java.util.Scanner;

public class EVA2_28_BUSCAR {

    public static void main(String[] args) {
      Scanner captu = new Scanner(System.in);
      int valor;
      int valores[] = new int[10];
      for(int f=0; f < valores.length; f++){
      valores[f] =(int)(Math.random() *100);
    }
      for(int f=0; f < valores.length; f++){
      System.out.println("(" + valores [f]+ ")");
    }
        System.out.println("");
        System.out.println("Valor a buscar");
        valor = captu.nextInt();
        
        for(int f =0; f< valores.length; f ++){
            if(valor == valores[f]){
                System.out.println("Valor encontrado");
                System.out.println("Posicion " + f);
                break;
            }
    }
}
}