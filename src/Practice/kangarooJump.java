package Practice;

public class kangarooJump {
    // Complete the kangaroo function below.
    public static String kangaroo(int x1, int v1, int x2, int v2) {

             if((x1+v1)==(x2+v2))
                 return "Yes";
             else
                 return "No";
    }

    public static void main(String args[])
    {
       System.out.print(kangaroo(0,2,5,3));
    }
}
