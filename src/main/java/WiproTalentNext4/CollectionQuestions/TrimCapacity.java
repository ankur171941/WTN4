package WiproTalentNext4.CollectionQuestions;

import java.util.ArrayList;

public class TrimCapacity {
    public static void main(String[]args)
    {
        ArrayList <Integer>arrayList = new ArrayList<Integer>(9);
        arrayList.add(2);
        arrayList.add(33);
        arrayList.add(1);
        arrayList.add(10);
        arrayList.add(30);
       arrayList.trimToSize();
       System.out.println(arrayList);


    }
}
