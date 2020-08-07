package WiproTalentNext4.CollectionQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SwapElements {
    public static void main(String [] args)
    {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("code");
        arrayList.add("skills");
        arrayList.add("good");
        System.out.println(arrayList);
        Collections.swap(arrayList,0,2);
        System.out.println(arrayList);
    }
}
