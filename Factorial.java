
import java.util.Scanner;

/**
 * Created by Gayathri on 22/08/17.
 */

public class Factorial {

    int _number = 0;

    public Factorial() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find factorial");
        int inNumber=sc.nextInt();
        if (inNumber < 0) {
            System.out.println("Enter a positive integer to find factorial");
            return;
        }
        _number = inNumber;
    }

    public int getNumber() {
        return _number;
    }
    public  int fact(int number) {
        if (number < 0)
            return 0;
        if (number == 0)
            return 1;
        else
            return number * fact(number-1);
    }
    public static void main(String[] args) {

        Factorial f = new Factorial();
        long factorialResult= f.fact(f.getNumber());
        System.out.println("Factorial of number " + f.getNumber() + " is " + factorialResult);
    }


}
