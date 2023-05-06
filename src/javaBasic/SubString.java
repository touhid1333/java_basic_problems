package javaBasic;

import java.util.Scanner;

public class SubString {

    public static void main(String[] args) {
        printSubStrings();
    }

    public static void printSubStrings() {
        Scanner scanner = new Scanner(System.in);
        String scanText = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        // capitalize -->
        if (scanText.length() >= 1 && scanText.length() <= 100 ) {
            System.out.println(scanText.substring(a, b));
        }
    }


}
