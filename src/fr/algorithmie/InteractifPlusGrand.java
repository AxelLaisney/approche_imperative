package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        System.out.println("Enter 10 numbers: ");
        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[10];

        for(int i = 0; i < 10; i++){
            int n = scan.nextInt();
            numbers[i] = n;
        }

        int max = 0;
        for(int n: numbers){
            if(n > max){
                max = n;
            }
        }

        System.out.println("The biggest number is: "+ max);
    }
}
