package fr.algorithmie;

public class AffichageInverse {
    public static void main(String[] args){
        int[] numbers = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        for(int n: numbers){
            System.out.println(n);
        }

        for(int i = -1;(i + numbers.length) >= 0; i--){
            System.out.println(numbers[numbers.length + i]);
        }

        int[] copyNumbers = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            copyNumbers[i] = numbers[i];
        }

        for(int c: copyNumbers){
            System.out.println("Copy of number: "+ c);
        }
    }
}
