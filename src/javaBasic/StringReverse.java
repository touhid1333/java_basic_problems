package javaBasic;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        checkPalindrome();
    }

    public static void checkPalindrome() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();

        if (text.length() <= 50) {
            boolean flag = true;
            char[] textArray = text.toLowerCase().toCharArray();
            char[] reverseTextArray = new char[textArray.length];
            int j = textArray.length - 1;
            for (int i = 0; i < textArray.length; i++) {
                reverseTextArray[j - i] = textArray[i];
            }
            for (int count = 0; count < textArray.length; count++) {
                if (textArray[count] != reverseTextArray[count]) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }


}
