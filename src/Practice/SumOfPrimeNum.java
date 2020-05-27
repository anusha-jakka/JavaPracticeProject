package Practice;

public class SumOfPrimeNum {



    public static boolean checkPrimeNum(int num)
    {
        boolean check=true;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                check=false;
            }
        }

        return check;
    }

    public static void main(String args[])
    {
        int num=54;
        boolean flag=false;
        for(int i=2;i<=num/2;i++)
        {
            if(checkPrimeNum(i)) {
                if (checkPrimeNum(num - i)) {
                    System.out.println("Sum of two prime numbers:"+i +"+"+(num-i)+"="+num);
                    flag=true;
                }
            }
        }

        if(flag==false)
        {
            System.out.println("No valid prime number combination found");
        }
    }
}
