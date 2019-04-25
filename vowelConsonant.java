package FirstDay;

import java.util.Scanner;

public class vowelConsonant {
    public static void main(String ar[]) {
        String a;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string");
        a = s.nextLine();
        int i = 0;
        int length=a.length();
        while (i<length) {
            char c=a.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
            i++;
        }


    }
}