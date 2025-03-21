package fr.algorithmie;

public class RechercheMax {
    public static void main (String[] args){
        int max = 0;

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        for(int a: array){
            if(a > max){
                max = a;
            }
        }

        System.out.println(max);
    }
}
