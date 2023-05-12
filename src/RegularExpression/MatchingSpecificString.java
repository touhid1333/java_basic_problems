package RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//The hackerrank team is on a mission to flatten the world by restructuring the DNA of every company on the planet. We rank programmers based on their coding skills, helping companies source great programmers and reduce the time to hire. As a result, we are revolutionizing the way companies discover and evaluate talented engineers. The hackerrank platform is the destination for the best engineers to hone their skills and companies to find top engineers.
public class MatchingSpecificString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String scanText = scanner.nextLine();
        scanner.close();

        Pattern p = Pattern.compile("hackerrank");
        Matcher m = p.matcher(scanText);
        int count = 0;
        while (m.find()){
                count++;
        }
        System.out.println("Number of matches : " + count);
    }
}
