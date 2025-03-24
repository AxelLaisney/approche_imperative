package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args){
        int array1[] = {6 ,3 , 3, 432, 63, 13, 784, 123, 74, 0};
        int array2[] = {0 ,3 , 3, 432, 63, 123, 74, 6};
        int array3[] = {0 ,3 , 74, 0};

        boolean firstLast6 = false;

        if(array1[0] == 6 || array1[array1.length - 1] == 6){
            firstLast6 = true;
        }
        System.out.println("First last 6 for array 1 is "+ firstLast6);

        firstLast6 = false;
        if(array2[0] == 6 || array2[array2.length - 1] == 6){
            firstLast6 = true;
        }
        System.out.println("First last 6 for array 2 is "+ firstLast6);

        firstLast6 = false;
        if(array3[0] == 6 || array3[array3.length - 1] == 6){
            firstLast6 = true;
        }
        System.out.println("First last 6 for array 3 is "+ firstLast6);
    }
}
