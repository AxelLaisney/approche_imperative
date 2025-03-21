package fr.algorithmie;

public class InverseContenu {
    public static void main(String[] args){
        int[] numbers = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] copyNumbers = new int[numbers.length];

        int j = 0;

        for(int i = -1; (i + numbers.length) >= 0; i--){
            copyNumbers[j] = numbers[numbers.length + i];
            j ++;
        }

        for(int n: numbers){
            System.out.println("Numbers: "+ n);
        }

        for(int c: copyNumbers){
            System.out.println("CopyNumber"+ c);
        }

    }
}
