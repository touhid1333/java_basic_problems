package javaBasic;

import java.io.EOFException;
import java.util.Scanner;

public class EOF {

    public static void main(String[] args) {
        dataTypePrint();
    }

    public static void dataTypePrint() {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while (scanner.hasNextLine()) {
            count++;
            String scanValue = scanner.nextLine();
            if (scanValue.equals("")) {
                return;
            } else {
                System.out.println(count + " " + scanValue);
            }
        }

        scanner.close();
    }


}
