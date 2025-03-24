package fr.algorithmie;

import java.util.Arrays;

public class ComparaisonTableau {
    public static void main(String[] args){
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;

        int count = 0;
        for(int a1: array1){
            for(int a2: array2){
                if(a1 == a2){
                    count++;
                }
            }
        }
        System.out.println("Number of identical elements: "+ count);
    }
}
