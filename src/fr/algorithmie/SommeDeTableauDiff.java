package fr.algorithmie;

public class SommeDeTableauDiff {
    public static void main(String[] args){

        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;





        if(array1.length == array2.length){
            int[] sum = new int[array1.length];
            for(int i = 0; i < array1.length; i++){
                sum[i] = array1[i] - array2[i];
            }
            for(int s: sum){
                System.out.println("sum is:"+ s);
            }

        }else if(array1.length > array2.length){
            int j = 0;
            int[] sum = new int[array1.length];
            for(int i = 0; i < array1.length; i++){
                if(j >= array2.length){
                    j = 0;
                }
                sum[i] = array1[i] - array2[j];
                j++;
            }
            for(int s: sum){
                System.out.println("sum is:"+ s);
            }
        }else if(array1.length < array2.length){
            int j = 0;
            int[] sum = new int[array2.length];
            for(int i = 0; i < array2.length; i++){
                if(j >= array1.length){
                    j = 0;
                }
                sum[i] = array1[j] - array2[i];
                j++;
            }
            for(int s: sum){
                System.out.println("diff is:"+ s);
            }
        }

    }
}
