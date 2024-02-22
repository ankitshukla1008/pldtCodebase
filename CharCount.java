/*	Write a Java program that takes a string input from the user and prints the count of each unique character in the input string. Implement the program using sets and loops. */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class CharCount {
    public static void main(String[] args) {
        System.out.print("Enter a String value: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        char[] chArr = s.toCharArray();

        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char cv = s.charAt(i);
            charSet.add(cv);
        }

        for (char ci : charSet) {
            int count = 0;
            for (char ch : chArr) {
                if (ci == ch) {
                    count++;
                }
            }
            System.out.println(ci + "= " + count);
        }
    }
}
