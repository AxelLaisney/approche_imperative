package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        int choice = 9;
        int[] numbers = new int[1];
        while(choice != 0){
            int check = 0;
            int i = 0;
            System.out.println("1. Ajouter un nombre \n2.Afficher les nombres existants");
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the number you want to save: ");
                    int n = scan.nextInt();
                    while(check == 0){
                        if(numbers[i] == 0){
                            numbers[i] = n;
                            check = 1;
                        }
                        if((i+1) == numbers.length && check != 1){
                            check = 2;
                        }
                        i++;
                    }

                    switch (check){
                        case 1:
                            System.out.println("Nnumber was saved!");
                            break;
                        case 2:
                            System.out.println("Array is full. Give a number to expand it");
                            int expand = scan.nextInt();
                            int[] newArray = new int[expand];
                            for (int j = 0; j < numbers.length; j++){
                                newArray[j] = numbers[j];
                            }
                            numbers = null;
                            numbers = newArray;
                            newArray = null;
                            break;
                        default:
                            System.out.println("Error");
                    }
                    break;
                case 2:
                    for(int nb: numbers){
                        System.out.println(nb);
                    }
                    break;
                default:
                    System.out.println("Error");
                    choice = scan.nextInt();
            }
        }

    }
}
