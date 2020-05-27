package Practice;

public class fibonaciiSeries {

    public static void fibonacii(int n)
    {
        int a=1,b=1;
        System.out.print(a+" "+b);
        for(int i=2;i<n;i++)
        {
            System.out.print(" "+(a+b));
            int sum=a+b;
            a=b;
            b=sum;

        }
    }

    public static void main(String argsp[])
    {

fibonacii(7);

    }
}
