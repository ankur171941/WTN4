package WiproTalentNext4;

import java.util.Scanner;

public class CountMarksOfStudents {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[30];
        for(int i=0;i<30;i++)
        {

            int a = sc.nextInt();
            while(a>100)
            {
                System.out.println("reenter the number as the the number enterd is greater than 100");
                a = sc.nextInt();

            }
            arr[i] = a;
        }
        int finalarr[] = new int[101];
        for(int j=0;j<30;j++)
        {
            finalarr[arr[j]]++;
        }
        int h=0;
        while(h<=100 )
        {
            if(finalarr[h] !=0)
            System.out.println("count of students scoring " + h + " is/are " + finalarr[h]);
            h++;
        }

    }
}
