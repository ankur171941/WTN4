package WiproTalentNext4.CollectionQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleElemts {
    public static void main(String [] args)
    {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("code");
        arrayList.add("skills");
        arrayList.add("good");
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
    }
}
