 package FirstDay;
 import java.util.Scanner;

 public class guessNo {
     public static void main(String args[]) {
         int guess, number;

         Scanner input = new Scanner(System.in);
         System.out.println("Enter the number ");
         number=input.nextInt();

         while (true) {
             System.out.println("Guess my number : ");
             guess = input.nextInt();

             if (guess == number) {
                 System.out.println("Congratulations !!! You've guessed it right... " + number + " Right");
                 break;

             } else if (guess < number) {
                 System.out.println(" Guessed Number is Lesser");

             } else
                 System.out.println("Guessed number is greater than input");
         }
     }
 }