package Practice;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class HashMapDemo{

    public static void main(String args[])
    {
        HashMap<Character, List<String>> map=new HashMap<Character, List<String>>();
        LinkedList<String> l1=new LinkedList<>();
        l1.add("car");
        l1.add("check");
        l1.add("Cibc");
        LinkedList<String> l2=new LinkedList<>();
        l2.add("add");
        l2.add("area");
        l2.add("apple");
        LinkedList<String> l3=new LinkedList<>();
        l3.add("lamp");
        l3.add("light");
        l3.add("lamb");
        map.put('C',sortListAlphabeticall(l1));
        map.put('a',sortListAlphabeticall(l2));
        map.put('l',sortListAlphabeticall(l3));
//        Collections.sort(l3);
//        System.out.println(l3);
        System.out.println("map data:  "+map);
        for(Map.Entry x: map.entrySet())
        {
            System.out.println(x.getKey()+" "+x.getValue());
        }

        Set<Map.Entry<Character,List<String>>> entrySet=map.entrySet();
        for(Map.Entry m:entrySet)
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

//        sortListAlphabeticall(l1);
    }


    public static List<String> sortListAlphabeticall(List<String> words)
    {
//        List<String> sortedWords=new LinkedList<String>();
        String temp=null;
        for(int i=0;i<words.size();i++)
        {
            for(int j=i+1;j<words.size();j++)
            {
                if(words.get(i).compareTo(words.get(j))==1) {
                    temp = words.get(i);
                    words.add(i, words.get(j));
                    words.add(j, temp);
                }
            }
        }
        System.out.println(words);
        return words;
    }



}
