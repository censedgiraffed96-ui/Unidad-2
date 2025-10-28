
package eva2_29_continue;

public class EVA2_29_CONTINUE {

    public static void main(String[] args) {
      //CONTINUE ---> DETIENE LA ITERACION (REPETICION) ACTUAL
      //IMPRIMIR NUMEROS PARES
      for (int f = 0; f < 100; f++){
          int resi = f % 2;
          if(resi != 0)
          continue; //aqui interrumpe el ciclo
          System.out.print(f + " _ ");
      }
    }
    
}
