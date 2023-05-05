package javaBasic;

import java.util.Scanner;

public class IntToString {

    public static void main(String[] args) {
        convertIntToString();
    }

    public static void convertIntToString() {
        Scanner scanner = new Scanner(System.in);
        int scanValue = scanner.nextInt();
        scanner.close();

        try {
            if (scanValue >= -100 && scanValue <= 100) {
                String converted = String.valueOf(scanValue);
                if (!converted.isEmpty()) {
                    System.out.println("Good job");
                } else {
                    throw new Exception("Wrong answer");
                }
            } else {
                throw new Exception("Wrong answer");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
