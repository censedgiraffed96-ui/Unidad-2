//ARATH 👍
package eva2_24_ciclo_infinito;

import java.util.Scanner;


public class EVA2_24_CICLO_INFINITO {
final static String USUARIO = "admin";
 final static String PWD = "admin";
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        String usu, contra;
        while(true){
        System.out.println("Acceso al sistema-----");
        System.out.println("Usuario:");
        usu = captu.nextLine();
        System.out.println("Contraseña:");
        contra = captu.nextLine();
        if (usu.equals(USUARIO)&&contra.equals(PWD))
            break; //termina el ciclo
        }
        System.out.println("Bienvenido al sistema");
    }
    
}
