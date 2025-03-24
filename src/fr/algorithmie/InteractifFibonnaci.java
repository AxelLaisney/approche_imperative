package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonnaci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int sum = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number for the Fibonnaci sequence: ");
        int n = scan.nextInt();

        System.out.println(a);
        for(int i = 0; i <= n; i++){
            sum = a + b;
            a = b;
            b = sum;
            System.out.println(a);
            System.out.println(b);
        }
    }
}
