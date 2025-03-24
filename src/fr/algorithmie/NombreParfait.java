package fr.algorithmie;

public class NombreParfait {
    public static void main (String[] args){
        int num = 6;

        if(num == 1){
            System.out.println("Number is 1. Give another number");
        }else{
            int sum = 1;

            for(int i = 2; i < num; i++){
                if((num % i) == 0){
                    sum += i;
                }
            }

            if(sum == num){
                System.out.println("Le nombre " + num + " est un nombre parfait");
            }else{
                System.out.println("Le nombre " + num + " n'est pas un nombre parfait");
            }
        }
    }

}
