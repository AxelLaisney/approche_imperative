package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interactif21Batons {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int first = rand.nextInt(2);
        int nextPlayer = 0;
        int choice = 0;
        int looser = 3;

        String[] batons = new String[21];
        for(int i = 0; i < batons.length; i++){
            batons[i] = "|";
        }

        if(first == 1){
            nextPlayer = 1;
            }else{
            nextPlayer = 0;
        }

        while(notEmpty(batons)){
            if(nextPlayer == 1){
                if(CountBaton(batons) != 1){
                    Display(batons);
                    System.out.println("Player turn."+CountBaton(batons)+" stick(s) left. Choose between 1 and 3 stick(s) to remove: ");
                    choice = scan.nextInt();
                    if(Check(choice, batons)){
                        RemoveBaton(choice, batons);
                    }
                    nextPlayer = 0;
                }else{
                    RemoveBaton(1, batons);
                    System.out.println("One stick was left!");
                    looser = 1;
                }
            }else{
                if(CountBaton(batons) != 1){
                    Display(batons);
                    choice = rand.nextInt(3)+1;
                    System.out.println("Computer turn. Removed "+ choice + " stick(s)");
                    if(Check(choice, batons)){
                        RemoveBaton(choice, batons);
                    }
                    nextPlayer = 1;
                }else{
                    RemoveBaton(1, batons);
                    System.out.println("One stick was left!");
                    looser = 0;
                }
            }
        }
        if(looser == 0){
            System.out.println("You win");
        }else{
            System.out.println("You lose! ");
        }
    }

    public static boolean Check(int n, String[] array){
        int remaining = CountBaton(array);

        if(n > remaining || n < 1 || n == 0){
            return false;
        }else if(n <= remaining){
            return true;
        }else {
            return false;
        }
    }

    public static void Display(String[] b){
        String display = "";
        for(String ba: b){
            if(ba.equals("|")){
                String format = " "+ba+" ";
                display += format;
            }

        }
        System.out.println(display);
    }

    public static boolean notEmpty(String[] batons){
        int count = CountBaton(batons);
        if(count != 0){
            return true;
        }else{
            return false;
        }
    }

    public static int CountBaton(String[] batons){
        int count = 0;
        for(String b: batons){
            if(b.equals("|")){
                count++;
            }
        }
        return count;
    }

    public static void RemoveBaton(int n, String[] array){
        int index = 0;
        while(n > 0 && notEmpty(array)){
            index = IndexOfBaton(array);
            array[index] = ".";
            n--;
        }
    }

    public static int IndexOfBaton(String[] array){
        int index = 0;
        boolean check = true;
        for(int i = 0; i < array.length; i++){
            if(array[i].equals("|") && check == true){
                index = i;
                check = false;
            }
        }
        return index;
    }
}
