package FirstDay;
import java.util.Scanner;
public class checkPalindrome {
    public static void main(String ar[])
    {
        int number,sum=0;
        int remainder1,remainder2;
         int reversenum=0;
        System.out.print("enter the number");
         Scanner s = new Scanner(System.in);
         number=s.nextInt();
         int num=number;

         while(number!=0)
         {
             remainder1=number%10;
             number=number/10;
             reversenum=reversenum*10+remainder1;

         }
         if(num==reversenum) {
             System.out.println(" is palindrom");
             while (num != 0) {
                 remainder2 = num % 10;
                 num = num / 10;
                 if (remainder2 % 2 == 0)
                     sum = sum + remainder2;

             }
             if (sum > 25)
                 System.out.println("sum is greater than 25");
             else
                 System.out.println("sum is less than 25");

         }
         else
             System.out.println("is not palindrom");

    }

}
