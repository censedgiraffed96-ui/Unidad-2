
package eva2_3_switch;


public class EVA2_3_SWITCH {

    
    public static void main(String[] args) {
       String valor = "Lunes";
       switch (valor){
       case "Lunes":
            System.out.println("1");
       break;
       case "Martes":
            System.out.println("2");
       break;
       case "Miercoles":
            System.out.println("3");
       break;
       case "Jueves":
            System.out.println("4");
       break;
       case "Viernes":
            System.out.println("5");
       break;
       case "Sabado":
            System.out.println("6");
       break;
       case "Domingo":
            System.out.println("7");
       break;
       default:
           System.out.println("Valor incorrecto");
           
        /*double valorDouble = 5.5;
           switch (valorDouble){//Solo scepta variables numericos
           case 1.1
           System.out.println("Valor1.1");
           brak;
           case 5.5
           System.out.println("Valor5.5");
           break;
           */
       
               
       }
    }
    
}
