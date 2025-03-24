package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(100)+1;
        Scanner scan = new Scanner(System.in);

        System.out.println("Guess a number between 1 and 100");
        int n = scan.nextInt();
        while(n != randomInt){
            if(n < randomInt ){
                System.out.println("The number is higher");
            }else{
                System.out.println("The number is lower");
            }
            n = scan.nextInt();
        }
        System.out.println("The number was indeed "+ n);
    }
}
