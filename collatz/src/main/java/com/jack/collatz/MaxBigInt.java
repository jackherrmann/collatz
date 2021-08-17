package com.jack.collatz;
import java.math.BigInteger; 

/**
 * Hello world!
 *
 */
public class MaxBigInt 
{


    public void printBigInt(int power) {
        System.out.println("10^" + power + "="); 
        System.out.println(BigInteger.TEN.pow(20)); 
        System.out.println(); 
        System.out.println(); 
        System.out.println(); 
        System.out.println(); 
    }


    public static void main( String[] args )
    {
        printBigInt(20); 
        printBigInt(40); 
        printBigInt(60); 
        printBigInt(80); 
        printBigInt(100); 
        printBigInt(150); 
        printBigInt(200); 
        printBigInt(300); 
        printBigInt(500);
        printBigInt(1000);  

    }
}