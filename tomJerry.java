package FirstDay;

import java.util.Scanner;

public class tomJerry {
    public static void main(String ar[])
    {
        int num;
        System.out.print("Enter the number");
        Scanner s=new Scanner(System.in);
        num= s.nextInt();
        if(num>20&&num<30)
        {
            if(num%2!=0)
                System.out.println("Tom");
            else
                System.out.println("Jerry");
        }

    }
}
