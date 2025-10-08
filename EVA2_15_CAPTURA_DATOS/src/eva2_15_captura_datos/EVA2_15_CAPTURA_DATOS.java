//Arath 👍
package eva2_15_captura_datos;

import java.util.Scanner;

public class EVA2_15_CAPTURA_DATOS {

    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        int tama;
            System.out.println("Cuantas calificaciones quieres capturar?");
            tama = captu.nextInt();  
        int califas[] = new int [tama];
        
        //captura 
        for(int f = 0; f < califas.length; f ++){
            System.out.println("Calificacion #" + (f + 1) + ":");
            califas[f]= captu.nextInt();
        }
        //lectura
        for(int f = 0; f < califas.length; f ++){
            System.out.println("[" + califas[f] + "]");
        }    
        //Promedio del grupo
        //Sumar todas las calificaciones
        int SumaCalifas = 0;
        for(int f = 0; f < califas.length; f ++){
            SumaCalifas = SumaCalifas + califas[f];
        }
        //SumaCalifas += califas[f];
            System.out.println("acumulado - " + SumaCalifas);
            double promedio = SumaCalifas / (double)califas.length;
            System.out.println("Promedio: " + promedio);
        
    
    }
}
