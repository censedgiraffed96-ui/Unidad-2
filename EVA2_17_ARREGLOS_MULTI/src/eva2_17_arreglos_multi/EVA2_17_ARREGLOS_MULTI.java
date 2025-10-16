//ARATH👍
package eva2_17_arreglos_multi;

public class EVA2_17_ARREGLOS_MULTI {

    public static void main(String[] args) {
       int matriz[][] = new int[3][4];
       //int cubo [][][] = new int[2][2][2];
       matriz[0][0] = 100;
       matriz[0][1] = 200;
       matriz[0][2] = 300;
       matriz[0][3] = 400;
        System.out.println(matriz.length);
        System.out.println(matriz[0].length);
        System.out.println(matriz[1].length);
        System.out.println(matriz[2].length);
       //ciclos anidados
       for(int f = 0; f < matriz.length; f++){
         for(int e = 0; e < matriz[1].length; e ++){
             System.out.print("("+matriz[f][e]+")");
         }
           System.out.println();
         }
        
    }
}