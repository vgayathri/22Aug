
/**
 * Write a description of class Fibonacci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Fibonacci
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Fibonacci
     */
    public static void Fibonacci(int a)
    {
        // initialise instance variables
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print(firstTerm + " ");
        System.out.print(secondTerm + " " );

        int nextTerm=0;
        for (int index =3; index <= a; index ++) {
            nextTerm=firstTerm+secondTerm;
            System.out.print(nextTerm+ " ");
            firstTerm=secondTerm;
            secondTerm=nextTerm;

        }
                       
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms to print for Fibonacci series: ");
        int noOfTerms=sc.nextInt();
        if (noOfTerms == 0) {
            return;
        } else if (noOfTerms == 1) {
            System.out.println(0);
        } else if (noOfTerms == 2) {
            System.out.println("0 1");
        } else {
            Fibonacci(noOfTerms);
            System.out.println();
        }
    }
}
