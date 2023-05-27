package RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingDigitAndNonDigit {
    public static void main(String[] args) {
        Regex_Test tester=new Regex_Test();
      //  tester.check("");
       tester.check("\\d{2}\\D\\d{2}\\D\\d{4}");// only solution for java 8 because test case 4 wrong for java 15


    }
}
class Regex_Test {

    public  void check(String pattern){
        Scanner scanner =new Scanner(System.in);
        String strInput=scanner.nextLine();
        Pattern p=Pattern.compile(pattern);

        Matcher matcher=p.matcher(strInput);

        boolean isCheck=matcher.matches();

        System.out.format("%s", isCheck);
    }
}