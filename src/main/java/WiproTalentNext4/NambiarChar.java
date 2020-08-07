package WiproTalentNext4;

import java.util.Scanner;

public class NambiarChar {
    static String helper(String str, int index){
        if(index>=str.length())
            return "";

        char firstC = str.charAt(index);

        boolean vowel = characterCheck(firstC);
        int sum = firstC;


        index=index+1;
        while(index<str.length()){
            char small = str.charAt(index);

            boolean smallAns = characterCheck(small);
            sum+=small;
            if(vowel!=smallAns)
                break;



            index++;
        }

        return (""+sum+helper(str, index+1));
    }
    static String nambiarNumber(String str){
        return helper(str,0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(nambiarNumber(str));
    }

    public static boolean characterCheck(char c)
    {
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
        {
            return true;
        }
        return false;
    }
}
