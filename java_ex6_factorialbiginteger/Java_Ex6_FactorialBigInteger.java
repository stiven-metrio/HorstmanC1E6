/**
 * Cay S. Horstmann -- Chapter 1
 * Exercise #6
 * Write a program that computes the factorial n! = 1 × 2 ×  . . .  × n, 
 * using BigInteger. Compute the factorial of 1000.
 */
package java_ex6_factorialbiginteger;

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
        int nValue = scan.nextInt(), nFactorial=1;
        for (int i=1; i<=nValue; i++){
            if(i<nValue)System.out.printf("%dx",i);else System.out.printf("%d",i);
            nFactorial *= i;
        }
        System.out.printf(" = %d%n",nFactorial);
    }
    
}