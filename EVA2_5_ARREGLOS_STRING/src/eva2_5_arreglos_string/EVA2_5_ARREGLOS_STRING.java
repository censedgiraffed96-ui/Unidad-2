
package eva2_5_arreglos_string;

import java.util.Scanner;


public class EVA2_5_ARREGLOS_STRING {

    
    public static void main(String[] args) {
       int [] a, b, c; //son 3 arreglos
       int x[], y, z; //aqui solo la x es arreglo
       String cadenas[] = new String[7];
       cadenas[0] = "Lunes";
       cadenas[1] = "Martes";
       cadenas[2] = "Miercoles";
       cadenas[3] = "Jueves";
       cadenas[4] = "Viernes";
       cadenas[5] = "Sabado";
       cadenas[6] = "Domingo";
       Scanner captu = new Scanner(System.in);
       int dia;
       System.out.println("Dia de la semana (0 a 6): ");
       dia = captu.nextInt();
       System.out.println(cadenas[dia]);
    }
    
}
