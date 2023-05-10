package javaBasic;

import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {
        checkAnagrams();
    }

    public static void checkAnagrams() {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        scanner.close();

        if (word1.length() == word2.length()) {

            char[] charWord1 = word1.toLowerCase().toCharArray();
            char[] charWord2 = word2.toLowerCase().toCharArray();

            boolean flag = true;

            for (int i = 0; i < charWord1.length; i++){
                boolean isMatched = false;
                int countInFirst = 0;
                int countInSecond = 0;
                for(int k = 0; k < charWord1.length; k++){
                    if(charWord1[i] == charWord1[k]){
                        countInFirst++;
                    }
                }
                for(int j = 0; j < charWord2.length; j++){
                    if(charWord1[i] == charWord2[j]){
                        countInSecond++;
                    }
                }
                if(countInFirst == countInSecond){
                    isMatched = true;
                }

                if(!isMatched){
                    flag = false;
                }
            }

            if(flag){
                System.out.println("Anagrams");
            }else {
                System.out.println("Not Anagrams");
            }

        } else {
            System.out.println("Not Anagrams");
        }
    }

    //
    // alternative way down here -----------------------------------------------------------
    //
    private static int CHARACTER_RANGE= 256;

    public boolean isAnagramCounting(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        int count[] = new int[CHARACTER_RANGE];
        for (int i = 0; i < string1.length(); i++) {
            count[string1.charAt(i)]++;
            count[string2.charAt(i)]--;
        }
        for (int i = 0; i < CHARACTER_RANGE; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }


}
