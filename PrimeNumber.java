
/**
 * Write a description of class PrimeNumber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrimeNumber
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class PrimeNumber
     */
    static void isPrimeNumber(int Number)
    {
        if (Number == 0 || Number == 1) {
            System.out.println("Neither prime nor non prime");
        }// initialise instance ifvariables
        int factor = 2;
        boolean isPrime = true;
        while (factor < Number) {
            if ( Number/factor == 0) {
                isPrime = false;
                break;
            }
            factor ++;
             
        } 
        
        if (isPrime) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is not Prime");
        }
        
    }

    public static void main (String [] args) {
        
        isPrimeNumber(10);
        isPrimeNumber(2);
        
    }
}