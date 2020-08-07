package WiproTalentNext4.CollectionQuestions;

import java.util.TreeMap;

public class DeleteAllElementsInTree {
    public static void main(String[] args)
    {
        TreeMap<Integer,String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(10, "hello");
        treeMap.put(20, "world");
        treeMap.put(30, "full");
        treeMap.put(40, "of");
        treeMap.put(50, "knowledge");
        System.out.println(treeMap);
        treeMap.clear();
        System.out.println(treeMap);

    }
}
