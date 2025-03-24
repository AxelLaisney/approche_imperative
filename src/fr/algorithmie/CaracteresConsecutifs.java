package fr.algorithmie;

public class CaracteresConsecutifs {
    public static void main(String[] args) {
        //String test = "addaffaldoqjfjfdkladalk";
        String test = "abcabcb";
        int count = 0;
        String result = "";

        for (char t : test.toCharArray()) {
            if (result.indexOf(t) == -1) {
                for (char a : test.toCharArray()) {
                    if(a == t){
                        count++;
                    }
                }
                result += t;
                result += count;
                count = 0;
            }
        }
        System.out.println(result);
    }
}

