package WiproTalentNext4.CollectionQuestions;

import java.util.ArrayList;

public class IncreaseOrDecreaseCapacity {
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(20);
        System.out.println(arrayList);
        arrayList.ensureCapacity(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        System.out.println(arrayList.size());
    }
}
