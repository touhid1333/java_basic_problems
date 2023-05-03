package javaBasic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.*;
import java.util.Scanner;

public class JavaLoopsTwo {

    public static void main(String[] args) {
        javaLoopsPrintTwo();
    }

    public static void javaLoopsPrintTwo() {
        int a = 0, b = 0, n = 0;
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int[] values = new int[q];

        for (int z = 0; z < q; z++){
            a = scanner.nextInt();
            b = scanner.nextInt();
            n = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) { // max ==> i = n - 1
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum = sum + (int) Math.pow(2, j) * b;
            }
            int total = a + sum;
            System.out.println(total);
        }
    }
}
