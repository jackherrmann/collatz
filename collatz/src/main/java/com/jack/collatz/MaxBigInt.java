package com.jack.collatz;
import java.math.BigInteger; 

/**
 * Hello world!
 *
 */
public class MaxBigInt 
{


    public static void printBigInt(int power) {
        System.out.println("2^" + power + "="); 
        System.out.println(BigInteger.TWO.pow(power)); 
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
        printBigInt(10000);
        printBigInt(100000);
        printBigInt(1000000); 


    }
}