package Cambalhota;

public class cambalhota {

    public static void main(String[] args) {
     
        int cc = 0; 
        while (cc<10){
            cc++;
            if (cc == 1 || cc == 2 || cc == 0){
                continue;
            }
            if (cc == 7){
                break;
            }
            System.out.println("Cambalhota" + cc);
        }
    }
}
