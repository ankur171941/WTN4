package WiproTalentNext4.CollectionQuestions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubString {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int londSubLength=0;
        String longestString="";
        char [] cha = str.toCharArray();

        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for(int i=0;i<cha.length;i++)
        {
            if(!map.containsKey(cha[i]))
            {
                map.put(cha[i], i);
            }
            else
            {
                i = map.get(cha[i]);
                map.clear();
            }
            if(londSubLength<map.size())
            {
                londSubLength = map.size();
                longestString = map.keySet().toString();
            }
        }
        System.out.println(longestString);
    }

}



//import java.util.*;
//public class longestNonRepeatingString {
//    public static String getLongestString(String s) {
//        int longestSubstringLength=0;
//        String longestString="";
//        char ch[]=s.toCharArray();
//        int i,j;
//        LinkedHashMap<Character,Integer> hs=new LinkedHashMap<Character,Integer>();
//        for(i=0;i<ch.length;i++) {
//            if(!hs.containsKey(ch[i])) {
//                hs.put(ch[i],i);
//            }
//            else {
//                i=hs.get(ch[i]);
//                hs.clear();
//            }
//            if(longestSubstringLength<hs.size()) {
//                longestSubstringLength=hs.size();
//                longestString=hs.keySet().toString();
//            }
//        }
//        return longestString;
//    }
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a string");
//        String s=sc.next();
//        System.out.println(getLongestString(s));
//    }
//
//}
//
//

