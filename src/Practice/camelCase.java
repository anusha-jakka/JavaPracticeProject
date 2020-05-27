package Practice;

import java.util.ArrayList;
import java.util.List;

public class camelCase {

    static int camelcase(String s) {

        int count=0;
        List<String> words=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            count++;
            if(Character.isUpperCase(s.charAt(i))) {
                words.add(s.substring(0, i));
                s = s.substring(i);
                i = 0;
                count=0;
            }
        }
        if(count<=s.length())
        {
            words.add(s.substring(0));
        }

        return words.size();
    }


    public static void main(String args[])
    {
        System.out.println(camelcase("saveChangesInTheEditor"));
    }
}
