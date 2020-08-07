package WiproTalentNext4.CollectionQuestions;

import java.util.TreeMap;

public class CeilingEntry {
    public static void main(String[] args)
    {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(2, "two");
        treeMap.put(10, "ten");
        treeMap.put(12, "twelve");
        treeMap.put(14, "fourteen");
        treeMap.put(16, "sixteen");
        System.out.println(treeMap.ceilingEntry(11));// greatest value less than the entered number

    }
}
