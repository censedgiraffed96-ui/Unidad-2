package eva2_exa1;

import java.util.Scanner;


public class EVA2_EXA1 {

    
    public static void main(String[] args) {
    double tiemp, natacion, ciclismo, carrera;
    Scanner captu = new Scanner(System.in);
        System.out.println("Tiempo en natación (min):  ");
        natacion = captu.nextInt();
        System.out.println("Tiempo en Ciclismo (min):  ");
        ciclismo = captu.nextInt();
        System.out.println("Tiempo en carrera (min):");
        carrera = captu.nextInt();
        
        tiemp = natacion + ciclismo + carrera;
        System.out.println("Tiempo total (min)");
        System.out.println(tiemp);
        
       if ((tiemp <= 120)&&(ciclismo <= 60)&&(natacion <= 60)&&(carrera <= 60))
        System.out.println("Clasificacion Excelente: ");
          else if((tiemp <= 150)||(ciclismo <= 70)||(natacion <= 70)||(carrera <= 70))
        System.out.println("Clasificacion Buena: ");
          else{
       System.out.println("Clasificacion Regular: ");
          }
    }
}
