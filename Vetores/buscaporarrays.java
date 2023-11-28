
package Vetores;
import java.util.Arrays;

public class buscaporarrays {

   
    public static void main(String[] args) {
        int vet[]={3, 7, 6, 1, 9, 4, 2};
        for(int v:vet){
            System.out.print(v + " ");
        }
        int p = Arrays.binarySearch(vet, 2);
        System.out.println("Encontrei o valor na posição " + p );
    }
    
}
