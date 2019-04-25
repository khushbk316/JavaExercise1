package FirstDay;

import java.util.Scanner;

public class smallCapital {
    public static void main(String ar[])
    {
        char ch;
        System.out.println("enter the character");
        Scanner s=new Scanner(System.in);

        ch= s.next().charAt(0);
        if(ch>='a'&&ch<='z')
            System.out.println("Small letter");
          else if(ch>='A'&&ch<='Z')
            System.out.println("Capital letter");
            else if(ch>='0'&&ch<='9')
            System.out.println("Numbers");
            else
            System.out.println("special");

    }
}
