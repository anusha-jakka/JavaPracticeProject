package Practice;

public class stringPassword {

    static int minimumNumber(int n, String password)
    {
        int lengthCount=0,numCount=0,lower_caseCount=0,upper_caseCount=0,special_charactersCount=0,finalCount=0;

        if(n<6)
        { lengthCount=6-n;}


            String numbers = "0123456789";
            String lower_case = "abcdefghijklmnopqrstuvwxyz";
            String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String special_characters = "!@#$%^&*()-+";

            for(int i=0;i<password.length();i++)
            {
                if(numbers.contains(String.valueOf(password.charAt(i))))
                {
                    numCount++;
                }
                else  if(lower_case.contains(String.valueOf(password.charAt(i))))
                {
                    lower_caseCount++;
                }
                else  if(upper_case.contains(String.valueOf(password.charAt(i))))
                {
                    upper_caseCount++;
                }
                else  if(special_characters.contains(String.valueOf(password.charAt(i))))
                {
                    special_charactersCount++;
                }
            }


//        if(lengthCount==0)
//        {finalCount++;}
        if(numCount==0)
        {finalCount++;}
        if(lower_caseCount==0)
        {finalCount++;}
        if(upper_caseCount==0)
        {finalCount++;}
        if(special_charactersCount==0)
        {finalCount++;}

        if((password.length()+finalCount)<6)
        {
            return finalCount+(6-(password.length()+finalCount));
        }

        return finalCount;
    }

    public static void main(String args[])
    {
        System.out.println(minimumNumber(3,"AD1"));
    }
}
