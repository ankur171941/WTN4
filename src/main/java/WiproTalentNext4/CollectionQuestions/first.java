package WiproTalentNext4.CollectionQuestions;

import java.util.*;

public class first {
    public static void main(String[] args)
    {
//        List list = new ArrayList<Integer>();
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(0);
//        System.out.println(list);
//        int a = (int)list.get(2);
//        Iterator iterator = list.iterator();
//        while(iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }
//        Set<String> set = new HashSet<String>();
//
        String str = "I am all good I am";
        String arr[] = str.split(" ");
        Set<String> set = new HashSet<String>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        Iterator iterator = set.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
