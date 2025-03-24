package fr.algorithmie;

import java.util.Arrays;

public class RechercheSecond {
    public static void main(String[] args){
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        Arrays.sort(array);

        System.out.println("Le plus grand second est " + array[array.length - 2]);
    }
}
