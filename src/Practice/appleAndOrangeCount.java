package Practice;

import java.util.LinkedList;
import java.util.List;

public class appleAndOrangeCount {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int countApple=0,countOrange=0;
        //apples distance
        for(int i=0;i<apples.length;i++)
        {
            if(((apples[i]+a)>=s) && ((apples[i]+a)<=t))
            {
                countApple++;
            }
        }

        //oranges distance
        for(int i=0;i<oranges.length;i++)
        {
            if((oranges[i]+b)>=s && (oranges[i]+b)<=t)
            {
                countOrange++;
            }
        }

        System.out.println(countApple);
        System.out.print(countOrange);
    }

    public static void main(String args[])
    {
        int[] apples={-2,2,1};
        int[] oranges={5,-6};

        countApplesAndOranges(7,11,5,15, apples,oranges);
    }
}
