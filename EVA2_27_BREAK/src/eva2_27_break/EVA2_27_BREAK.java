
package eva2_27_break;

import java.util.Scanner;

public class EVA2_27_BREAK {
    public static void main(String[] args) {
        Scanner captu =new Scanner(System.in); 
        int valor, adivinar;
        do{
            adivinar = (int)(Math.random() *5);
            System.out.println("Adivina el numero, -1 para terminar");
            valor = captu.nextInt();
            if (valor == adivinar)
                System.out.println("Adivinaste!!");
            else if(valor == -1){
                System.out.println("Gracias por jugar");
                break;
            }else{
                System.out.println("No adivinaste!!");
            }
        }while(true); //condicion para repetir (true)
    }
    
}
