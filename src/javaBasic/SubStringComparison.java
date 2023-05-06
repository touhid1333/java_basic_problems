package javaBasic;

import java.util.Scanner;

public class SubStringComparison {

    public static void main(String[] args) {
        printSubStringsComparison();
    }

    public static void printSubStringsComparison() {
        Scanner scanner = new Scanner(System.in);
        String scanText = scanner.nextLine();
        int k = scanner.nextInt();
        scanner.close();


        String smallest = scanText.substring(0, k);
        String largest = scanText.substring(0, k);

        for (int i = 0; i <= scanText.length() - k; i++) {
            String a = scanText.substring(i, (i + k));
            if (a.compareTo(smallest) < 0) {
                smallest = a;
            }
            if (a.compareTo(largest) > 0) {
                largest = a;
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }


}
