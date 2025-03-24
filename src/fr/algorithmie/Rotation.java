package fr.algorithmie;

import java.util.Arrays;

public class Rotation {
    public static void main(String[] args){
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = Arrays.copyOf(array1, array1.length);

        for(int i = 0; i < array1.length; i++){
            if((i + 1) == array1.length){
                array1[0] = array2[i];
            }else{
                array1[i + 1] = array2[i];
            }
        }

        for(int a: array1){
            System.out.println(a);
        }
    }
}
