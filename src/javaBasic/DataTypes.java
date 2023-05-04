package javaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.math.*;

public class DataTypes {

    public static void main(String[] args) {
        dataTypePrint();
    }

    public static void dataTypePrint() {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        // for loop -->
        for (int i = 0; i < index; i++) {
            try {
                long value = scanner.nextLong();
                System.out.println(value + " can be fitted in:");

                if (value >= -128 && value <= 127) {
                    System.out.println("* byte");
                }

                if (value >= -32768 && value <= 32767) {
                    System.out.println("* short");
                }

                if (value >= -Math.pow(2, 31) && value < Math.pow(2, 31)) {
                    System.out.println("* int");
                }

                if (value >= -Math.pow(2, 63) && value < Math.pow(2, 63)) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }

        scanner.close();
    }


}
