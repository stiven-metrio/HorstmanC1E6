/**
 * Cay S. Horstmann -- Chapter 1
 * Exercise #6
 * Write a program that computes the factorial n! = 1 × 2 ×  . . .  × n, 
 * using BigInteger. Compute the factorial of 1000.
 */
package java_ex6_factorialbiginteger;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author jhonatan
 */
public class Java_Ex6_FactorialBigInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Calculate factorial of: ");
        String value = scan.next();
        System.out.printf("Factorial of %s is: ",value);
        System.out.println(factorial(new BigInteger(value)));
    }
    
    public static BigInteger factorial(BigInteger number){
        if(number.equals(BigInteger.ZERO))return BigInteger.ONE;
        else return number.multiply(factorial(number.subtract(BigInteger.ONE)));
    }
    
}