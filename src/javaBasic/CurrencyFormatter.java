package javaBasic;

import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

    public static void main(String[] args) {
        convertCurrency();
    }

    public static void convertCurrency() {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat formatterUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat formatterInd = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        NumberFormat formatterChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat formatterFrench = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + formatterUS.format(payment));
        System.out.println("India: " + formatterInd.format(payment));
        System.out.println("China: " + formatterChina.format(payment));
        System.out.println("France: " + formatterFrench.format(payment));
    }


}
