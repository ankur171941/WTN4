package WiproTalentNext4;

import java.util.Scanner;

public class NambiarNum {
    public Scanner sc = new Scanner(System.in);
    public String nambiarNumber(String str)
    {
       String str1 = str;
       int i=0;
       int total =0;
       String stri = "";
       String k="";
       while(i<str1.length())
       {
           k = EvenOrOdd(str1.charAt(i)-'0');
           total = str1.charAt(i)-'0';
           if(k.equals("odd"))
           {
               i++;
               while(EvenOrOdd(total)=="odd" && i<str1.length())
               {
                   total=total+(str1.charAt(i)-'0');
                   i++;
               }
               stri = stri + total;
               total = 0;
           }
           else if(k.equals("even"))
           {
               i++;
               while(EvenOrOdd(total)=="even" && i<str1.length())
               {
                   total=total+(str1.charAt(i)-'0');
                   i++;
               }
               stri = stri + total;
               total=0;

           }

       }
       return stri;

    }
    public String EvenOrOdd(int sum)
    {
        return sum%2==0 ? "even":"odd";
    }
    public static void main(String args[])
    {
        NambiarNum nn= new NambiarNum();
        System.out.println(nn.nambiarNumber("9814508255"));
    }
}
