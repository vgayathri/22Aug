
/**
 * Write a description of class Palindrome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.*;
import java.util.Scanner;

public class Palindrome
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Palindrome
     */
    static void checkPalindromeAsStr(String Number)
    {
        String reverse = new StringBuffer(Number).reverse().toString();
        if (reverse.equals(Number.toString())) {
                System.out.println("String is a Palindrome");
            } else {
                System.out.println("String is a *NOT* Palindrome");
            }
    }
    
    static void CheckPal (int number) {

        int revNum = 0;
        int temp = number;
        int index = 0;
        if (temp < 10) {
               System.out.println(number + " is a palindrome");
               return;
            }
        while (temp > 0) {
            int rem = temp%10;
            temp = temp/10;
            revNum = revNum * (10 ^ index) + rem;
            //System.out.println(revNum);
        }
        if (revNum == number) {
              System.out.println(number + " a palindrome");
        } else {
                System.out.println(number + " is not a palindrome");
        }
          
    }

    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check for palindrome :");
        int inNumber=sc.nextInt();
        CheckPal(inNumber);
    }
}
