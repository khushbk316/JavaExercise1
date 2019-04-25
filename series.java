package FirstDay;

import java.util.Scanner;

public class series {
    public static void main(String ar[])
    {
        int num,i,j;
        System.out.println("enter the no");
        Scanner s=new Scanner(System.in);
        num= s.nextInt();
        for(i=1;i<=num;i++)
        {
            for(j=i;j>=1;j--)
                System.out.print(i);
        }

    }
}
