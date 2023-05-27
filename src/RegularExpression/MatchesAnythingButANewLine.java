package RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MatchesAnythingButANewLine {
    public static void main(String[] args) {
        Tester tester=new Tester();
        tester.check("^(.{3}.){3}.{3}$");

    }

}

class Tester {

    public  void check(String pattern){
        Scanner scanner =new Scanner(System.in);
        String strInput=scanner.nextLine();
        Pattern p=Pattern.compile(pattern);

        Matcher matcher=p.matcher(strInput);

        boolean isCheck=matcher.matches();

        System.out.format("%s", isCheck);
    }
}