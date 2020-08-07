package WiproTalentNext4.CollectionQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapQues {
    public static void main(String [] args)
    {

        int c=0;
        int arr[] = new int[99];
        String val[] = new String [99];
        Map<Integer, String> mm = new HashMap<Integer, String>();
        mm.put(1, "hello");
        mm.put(2, "world");
        mm.put(3, "salute");
        mm.put(4, "warriors");
        Set ss = mm.entrySet();
        Iterator i = ss.iterator();
        while(i.hasNext())
        {
            Map.Entry<Integer, String> e = (Map.Entry<Integer, String>)i.next();
            arr[c] = e.getKey();
            val[c] = e.getValue();
            c++;
        }
        for(int k=0;k<c;k++)
        {
            System.out.println(arr[k]+" "+ val[k]);
        }

    }
}
