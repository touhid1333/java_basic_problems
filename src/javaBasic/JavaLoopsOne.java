package javaBasic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JavaLoopsOne {

    public static void main(String[] args) {
        javaLoopsPrintOne();
    }

    public static void javaLoopsPrintOne() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            bufferedReader.close();

            if (n >= 2 && n <= 20) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(n + " x " + i + " = " + (n * i));
                }
            }
        } catch (Exception e) {
            // do nothing
        }
    }
}
