package Practice;

public class twoStrings {

    public static String Strings(String s1, String s2)
    {
        long count=0;
        for(long i=0;i<s1.length();i++)
        {
            if(s2.contains(Character.toString(s1.charAt((int)i))))
            {count++;}
        }

        if(count>0)
        return "YES";
        else
        return "NO";
    }
    public static void main(String args[])
    {
        String s1="hello";
        String s2="world";
        System.out.println(Strings(s1,s2));
    }
}
