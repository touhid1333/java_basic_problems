package javaBasic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegexAndIPAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//       String value ="";
//        String[] value1=new String[6];
//        for (int i=0; i<6;i++){
//            value= scanner.next();
//
//            value1[i]=value;
//        }
//        for (int i=0; i<value1.length;i++){
//            System.out.println(isValidIpAddress(value1[i]));
//
//        }

        while (scanner.hasNext()){
            String IP=scanner.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }

    public static boolean isValidIpAddress(String ip) {
        String zeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";
        String regex = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;

        Pattern pattern = Pattern.compile(regex);



        if (ip == null) {
            return false;
        }
        Matcher matcher=pattern.matcher(ip);
        return matcher.matches();

    }
    static class  MyRegex{
        public String pattern="([1][\\d][\\d]|[0][0][0]|([0][0]|)[\\d]|([0]|)[\\d][\\d]|[2][0-4][\\d]|[2][5][0-5])."
                + "([1][\\d][\\d]|[0][0][0]|([0][0]|)[\\d]|([0]|)[\\d][\\d]|[2][0-4][\\d]|[2][5][0-5])."
                + "([1][\\d][\\d]|[0][0][0]|([0][0]|)[\\d]|([0]|)[\\d][\\d]|[2][0-4][\\d]|[2][5][0-5])."
                + "([1][\\d][\\d]|[0][0][0]|([0][0]|)[\\d]|([0]|)[\\d][\\d]|[2][0-4][\\d]|[2][5][0-5])";
    }
}
