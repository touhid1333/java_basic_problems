package javaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElse {

    public static void main(String[] args) {
        ifElsePrint();
    }

    public static void ifElsePrint() {
        int n = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(bufferedReader.readLine().trim());
            bufferedReader.close();
        } catch (IOException e) {
            //throw new RuntimeException(e);
        }

        // main logic -->
        if (n >= 1 && n <= 100) {
            if (n % 2 != 0) {
                System.out.println("Weird");
            } else {
                if (n <= 5) {
                    System.out.println("Not Weird");
                } else if (n <= 20) {
                    System.out.println("Weird");
                } else {
                    System.out.println("Not Weird");
                }
            }
        }
    }
}
