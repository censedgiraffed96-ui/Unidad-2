
package eva2_2_switch;

import java.util.Scanner;


public class EVA2_2_SWITCH {

    
    public static void main(String[] args) {
        int dia;
        Scanner day = new Scanner(System.in);
        System.out.println("dia de la semana (1-7): ");
        dia = day.nextInt();
        switch (dia){ //opciones ---> casos
            case 1:
            System.out.println("Lunes");
            break; //fin de case y del switch
            case 2:
            System.out.println("Martes");
            break; //fin de case y del switch
            case 3:
            System.out.println("Miercoles");
            break; //fin de case y del switch
            case 4:
            System.out.println("Jueves");
            break; //fin de case y del switch
            case 5:
            System.out.println("Viernes");
            break; //fin de case y del switch
            case 6:
            System.out.println("Sabado");
            break; //fin de case y del switch
            case 7:
            System.out.println("Domingo");
            break; //fin de case y del switch
            default: //opcional, siempre al final; no necesita break
                System.out.println("Numero incorrecto");
        }
        
        
    }
    
}
