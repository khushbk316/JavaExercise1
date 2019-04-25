package FirstDay;

import java.util.Scanner;

public class Repeatation {
      public static void main(String ar[])
      {
          int num,i;
          String a="";
          String b="";
          String str="stackroute";
          System.out.println("Enter the no");
          Scanner s=new Scanner(System.in);
          num=s.nextInt();
          int length=str.length();
          a=str.substring(length-num,length);
          for(i=num;i>=1;i--)
              b=b+a;
          System.out.println(str+b);

      }



}
