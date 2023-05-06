package javaBasic;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class StringIntroduction {

    public static void main(String[] args) {
        printStrings();
    }

    public static void printStrings() {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        scanner.close();

        // length -->
        System.out.println(first.length() + second.length());

        // lexicographically compare -->
        // "Apple" < "Ball" == Apple , Ball -->
        String result = first.compareTo(second) > 0 ? "Yes" : "No";
        System.out.println(result);

        // capitalize -->
        System.out.println(first.substring(0, 1).toUpperCase() + first.substring(1) + " " + second.substring(0, 1).toUpperCase() + second.substring(1));
    }


}
