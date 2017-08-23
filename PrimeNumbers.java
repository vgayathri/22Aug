import com.company.Aug23.MyAnimal;

import java.util.Scanner;

/**
 * Created by Gayathri on 22/08/17.
 */
public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check for prime :");
        int inNumber=sc.nextInt();
        checkPrime(inNumber);


    }

    public static void checkPrime(int pNumber){
        // if the number passed is 0 or 1 say its neither prime or non prime
        if (pNumber <=1 ) {
            System.out.println("Number "+  pNumber + " is neither prime nor a composite number");
            return;
        }
        // check for divisors from 2 to all numbers other than itself
        boolean isPrime = true;
        for (int div = 2; div < pNumber; div++){
            isPrime=((pNumber%div)==0)?false:true;
            // if we found a factor we can exit the loop
            if (!isPrime)
                break;

        }
        System.out.println(pNumber + " is Prime : " + isPrime);
    }
}
