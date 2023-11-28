
package Vetores;

import java.util.Arrays;

public class Posicao {

    
    public static void main(String[] args) {
        
        int n[] = {3,2,9,8,7,5};
         
        Arrays.sort(n);  
        for(int c=0; c<=n.length; c++){
            System.out.println("Na posição " + c + " temos o valor " + n[c]);
        }
    }
    
}
