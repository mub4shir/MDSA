import java.util.*;
import java.io.*;

class  LongestWord {
    String longestWord(String sen) {
        String[] words = sen.split("[^\\w]");
        for (String s: words) {
            System.out.println(s+" ");

        }
        String longest = "";
        for(String word : words) {
            if(word.length() > longest.length())longest = word;
        }
        return longest;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        LongestWord c = new LongestWord();
        System.out.print(c.longestWord(s.nextLine()));
    }

}
