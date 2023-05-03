package javaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StdinAndStdoutII {

    public static void main(String[] args) {
        printStdinAndStdoutII();
    }

    public static void printStdinAndStdoutII() {
        Scanner scanner = new Scanner(System.in);
        int scanInt = scanner.nextInt();
        double scanDouble = scanner.nextDouble();
        scanner.nextLine();
        String scanString = scanner.nextLine();
        scanner.close();

        System.out.println("String: " + scanString);
        System.out.println("Double: " + scanDouble);
        System.out.println("Int: " + scanInt);
    }
}
