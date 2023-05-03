package javaBasic;

import java.util.Scanner;

public class StdinAndStdoutI {

    public static void main(String[] args) {
        printStdinAndStdout();
    }

    public static void printStdinAndStdout() {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();
        scanner.close();
        System.out.println(input1);
        System.out.println(input2);
        System.out.println(input3);
    }
}
