package fr.algorithmie;

public class AffichageSuite {
    public static void main (String[] args){
        //number from 0 to 10
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        for(int i = 0; i <= 10; i++){
            if((i & 1) == 0){
                System.out.println("Even numbers: " + i);
            }
        }

        for(int i = 0; i <= 10; i++) {
            if ((i & 1) != 0) {
                System.out.println("Odd numbers: " + i);
            }
        }

        int j = 0;
        while( j < 10 ){
            System.out.println(j);
            j++;
        }

        j = 0;
        while(j < 10){
            if((j & 1) == 0){
                System.out.println("Even numbers: " + j);
            }
            j++;
        }

        j = 0;
        while(j < 10){
            if((j & 1) != 0){
                System.out.println("Even numbers: " + j);
            }
            j++;
        }
    }
}
