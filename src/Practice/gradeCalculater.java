package Practice;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class gradeCalculater {

    public static List<Integer> gradeCal(List<Integer> grades)
    {
        List<Integer> studentGrades=new LinkedList<>();
        for(int i=0;i<grades.size();i++)
        {
            int reminder=(grades.get(i)%5);
            int next5Mult=grades.get(i)+(5-reminder);
            if(((next5Mult-grades.get(i))<3) && (grades.get(i)>=38))
            {
                studentGrades.add(next5Mult);
            }
            else
            {
                studentGrades.add(grades.get(i));
            }
        }
        return studentGrades;
    }

    public static void main(String args[])
    {
        int grade[]={73,67,38,33};
        List<Integer> grades=new LinkedList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
       System.out.println( gradeCal(grades));

    }

}
