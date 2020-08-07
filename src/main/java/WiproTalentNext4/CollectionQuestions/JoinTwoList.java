package WiproTalentNext4.CollectionQuestions;

import java.util.ArrayList;

public class JoinTwoList {
    public static void main(String [] args)
    {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("morning");
        System.out.println(arrayList);
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("good");
        arrayList1.add("speech");
        System.out.println(arrayList1);
        arrayList.addAll(arrayList1);
        System.out.println(arrayList);
    }
}
