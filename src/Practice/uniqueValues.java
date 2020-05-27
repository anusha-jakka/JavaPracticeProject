package Practice;

import sun.reflect.generics.tree.SimpleClassTypeSignature;

import java.util.ArrayList;
import java.util.List;

public class uniqueValues {

    public static List<Integer> returnUniqueVal(int arr[])
    {
        List<Integer> unique=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!unique.contains(arr[i]))
            {
                unique.add(arr[i]);
            }
        }

        return unique;
    }

    public static void main(String args[])
    {
        int repeated[]={1,2,2,4,5,5,8,9,10,11,11,12};
        System.out.print(returnUniqueVal(repeated));
    }
}
