package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i ++){
            sum += i;
        }

        System.out.println(sum);
    }
}
