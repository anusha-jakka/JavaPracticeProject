package Practice;

import java.util.*;
import java.util.LinkedList;
import java.util.List;

public class RansomeNote {

    public static void main(String args[])
    {
        String magazine="two times three is not four";
        String[] magazineWords=magazine.split(" ");
        HashMap<String,Boolean> magazineCheck=new HashMap<String, Boolean>();
        for (String word:magazineWords) {
            magazineCheck.put(word,false);
        }

        String ransomeNote="two times two is four";
        String[] ransomeNoteWords=ransomeNote.split(" ");


        int count=0;
        for(int i=0;i<ransomeNoteWords.length;i++)
        {

            for(Map.Entry key:magazineCheck.entrySet())
            {
                if((ransomeNoteWords[i].equals(key.getKey()))&&(key.getValue().equals(false)))
                {
                    count++;
                    magazineCheck.remove(key.getKey().toString(),true);

                    break;
                }
            }
        }
        System.out.println("Map after-->"+magazineCheck);

        if(count==ransomeNoteWords.length)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
}
