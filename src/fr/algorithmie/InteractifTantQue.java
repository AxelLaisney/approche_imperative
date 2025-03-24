package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();

        while(userInput < 1 || userInput > 10){
            System.out.println("Enter number between 1 and 10");
            userInput = scan.nextInt();
        }
    }
}
