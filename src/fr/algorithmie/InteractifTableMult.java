package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int userIpt = scan.nextInt();

        for(int i = 1; i <= 10 ; i++){
            System.out.println(userIpt + " * "+ i +" = "+ (userIpt * i));
        }
    }
}
