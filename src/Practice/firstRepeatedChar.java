package Practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class firstRepeatedChar {

    public static char returnFirstRepeatChar(String name)
    {
        Map<Character,Integer> charCount=new LinkedHashMap<>();
        char firstRepeatChar=' ';
        for(int i=0;i<name.length();i++)
        {
            int count=0;
            for(int j=0;j<name.length();j++)
            {
                if(name.charAt(i)==name.charAt(j))
                {
                    count++;
                }
            }
            charCount.put(name.charAt(i),count);
        }
        System.out.println(charCount);

        for(Map.Entry entry:charCount.entrySet())
        {
            if((int)entry.getValue()>1)
            {
                firstRepeatChar= (Character)entry.getKey();
                break;
            }

        }
        return firstRepeatChar;
    }

    public static void main(String args[])
    {
       System.out.println("First repeated character: "+returnFirstRepeatChar("asdhdfkghjhkkkkk"));
    }
}
