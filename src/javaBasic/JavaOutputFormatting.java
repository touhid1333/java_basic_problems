package javaBasic;

import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        printFormattedString();
    }

    public static void printFormattedString() {
        Scanner scanner = new Scanner(System.in);
        String firstLineString = scanner.next();
        int firstLineInt = scanner.nextInt();
        scanner.nextLine();
        String secondLineString = scanner.next();
        int secondLineInt = scanner.nextInt();
        scanner.nextLine();
        String thirdLineString = scanner.next();
        int thirdLineInt = scanner.nextInt();
        scanner.close();
        System.out.println("================================");
        System.out.printf("%-15s%03d%n",firstLineString,firstLineInt);
        System.out.printf("%-15s%03d%n",secondLineString,secondLineInt);
        System.out.printf("%-15s%03d%n",thirdLineString,thirdLineInt);
        System.out.println("================================");
    }
}
