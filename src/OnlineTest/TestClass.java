package OnlineTest;

import java.util.*;

public class TestClass {

//    String str="Let's";
    public static void main(String args[])
    {
       HashMap<String,String> stringconversion=new HashMap<String,String>();
        stringconversion.put("Let's have some fun","");
        stringconversion.put("C is for cookie,that's enough for me","");
        stringconversion.put("By the power of Grayskull!","");
        System.out.println("String conversion map:"+ stringconversion);

       LinkedList<Character> char1=new LinkedList<Character>();
       char1.add('a');
       char1.add('A');
        LinkedList<Character> char2=new LinkedList<Character>();
        char2.add('e');
        char2.add('E');
        LinkedList<Character> char3=new LinkedList<Character>();
        char3.add('i');
        char3.add('I');
        LinkedList<Character> char4=new LinkedList<Character>();
        char4.add('o');
        char4.add('O');
        LinkedList<Character> char5=new LinkedList<Character>();
        char5.add('s');
        char5.add('S');
        LinkedList<Character> char6=new LinkedList<Character>();
        char6.add('t');
        char6.add('T');
        LinkedList<Character> char7=new LinkedList<Character>();
        char7.add('b');
        char7.add('D');

        HashMap<LinkedList<Character>,Character> map=new HashMap<LinkedList<Character>,Character>();
        map.put(char1,'4');

        map.put(char2,'3');
        map.put(char3,'1');
        map.put(char4,'0');
        map.put(char5,'5');
        map.put(char6,'7');
        map.put(char7,'5');

        System.out.println("Map data: "+map);

        for (String entry: stringconversion.keySet())
        {
            String convString="";

            for(int i=0;i<entry.length();i++)
            {
                int count=0;
                for(LinkedList<Character> checkVal:map.keySet())
                {
//                    System.out.println(checkVal);
                    if(checkVal.contains(entry.charAt(i)))
                    {
//                        convString+= entry.replace(entry.charAt(i),map.get(checkVal));
                        convString+= map.get(checkVal);


//                        System.out.println("$$:"+checkVal+convString);
                        break;
                    }
                    else
                    {count++;}

                }
//                System.out.println("**:"+convString);
                if(count==map.size())
                {
                    convString+=entry.charAt(i);
//                    System.out.println("##:"+convString);

                }
            }
            stringconversion.put(entry,convString);
        }

        System.out.println("Strings after conversion: "+stringconversion);


    }
}
