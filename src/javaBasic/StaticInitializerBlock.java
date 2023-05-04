package javaBasic;

import java.util.Scanner;


public class StaticInitializerBlock {

    static Scanner scanner = new Scanner(System.in);
    static int b = scanner.nextInt();
    static int h = scanner.nextInt();
    static boolean flag = true;

    static {
        try{
            if (b <= 0 || h <= 0) {
                flag = false;
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    /*static {
        int b;
        int h;
        Scanner scanner = new Scanner(System.in);
        b = scanner.nextInt();
        h = scanner.nextInt();

        if (b <= 0 || h <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println(b * h);
        }
    }*/

    public static void main(String[] args) {
        if(flag){
            System.out.println(b * h);
        }
    }


}
