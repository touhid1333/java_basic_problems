package javaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
//        BigInteger n = s.nextBigInteger();
//        if (isPrimeNumber(n)) {
//            System.out.println("prime");
//        } else {
//            System.out.println("not prime");
//        }

        BigInteger n = s.nextBigInteger();
        s.close();
        if (n.isProbablePrime(50)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        s.close();
    }

    private static boolean isPrimeNumber(BigInteger n) {
        int value=n.intValue();
        int m= value/2;
        if (value<=1){
            return  false;
        }
        for (int i=2; i<=m;i++){
            if (value%i==0){
                return false;
            }
        }

        return true;
    }
}
