package javaBasic;

import java.util.Scanner;

public class StringTokens {

    public static void main(String[] args) {
        printStringToken();
    }

    public static void printStringToken() {
        Scanner scanner = new Scanner(System.in);
        String scanString = scanner.nextLine();
        scanner.close();

        if (scanString.trim().length() >= 1) {
            String[] results = scanString.trim().split("[ !,?._'@]+");
            System.out.println(results.length);
            for (int i = 0; i < results.length; i++) {
                System.out.println(results[i]);
            }
        } else {
            System.out.println(0);
        }
    }

}
