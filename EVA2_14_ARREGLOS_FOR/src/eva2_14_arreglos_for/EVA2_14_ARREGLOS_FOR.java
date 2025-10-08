
package eva2_14_arreglos_for;

public class EVA2_14_ARREGLOS_FOR {

    public static void main(String[] args) {
       int arreglo[] = new int [10];
       //System.out.println((int)(Math.random() * 100));
       for(int f = 0; f < 10; f++)
           arreglo[f] = (int)(Math.random() * 100);
       for(int f = 0; f < 10; f++)
          System.out.print("[" + arreglo [f] + "]");
      
    }

}
