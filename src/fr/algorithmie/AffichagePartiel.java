package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args){
        int[] numbers = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        //if superior to 3
        for(int n: numbers){
            if(n > 3){
                System.out.println(n);
            }
        }

        //display even numbers
        for(int n: numbers){
            if((n & 1) == 0){
                System.out.println(n);
            }
        }

        //display odd numbers
        for(int n: numbers){
            if(((n & 1) != 0)){
                System.out.println(n);
            }
        }

        //index of odd number
        for(int i = 0; i < numbers.length; i++){
            if((numbers[i] & 1) != 0){
                System.out.println("index: "+ i);
            }
        }
    }
}
