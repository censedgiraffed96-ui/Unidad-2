
package eva2_6_inicializar;

import java.util.Scanner;


public class EVA2_6_INICIALIZAR {

    
    public static void main(String[] args) {
      String DiasSemana[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
      Scanner captu = new Scanner(System.in);
       int dia;
       System.out.println("Dia de la semana (0 a 6): ");
       dia = captu.nextInt();
       System.out.println(DiasSemana[dia]);
    }
    
}
