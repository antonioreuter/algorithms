/*
Roy wanted to increase his typing speed for programming contests. So, his friend advised him to type the sentence
"The quick brown fox jumps over the lazy dog" repeatedly, because it is a pangram. (Pangrams are sentences constructed by using
every letter of the alphabet at least once.)

After typing the sentence several times, Roy became bored with it. So he started to look for other pangrams.
Given a sentence s, tell Roy if it is a pangram or not.

Input Format
Input consists of a string s.

Constraints
Length of s can be at most 103 (1≤|s|≤103) and it may contain spaces, lower case and upper case letters.
Lower-case and upper-case instances of a letter are considered the same.

Output Format
Output a line containing pangram if s is a pangram, otherwise output not pangram.

Sample Input
Input #1
We promptly judged antique ivory buckles for the next prize

Input #2
We promptly judged antique ivory buckles for the prize

Sample Output
Output #1 => pangram
Output #2 => not pangram

Explanation
In the first test case, the answer is pangram because the sentence contains all the letters of the English alphabet.
*/

package hackerrank.algorithms;

/**
 * Created by aandra1 on 01/02/16.
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pangrams {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);
    String phrase = in.nextLine();
    List<String> alphabet = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
    for (int i = 0; i < phrase.length(); i++) {
      char normalized = Character.toLowerCase(phrase.charAt(i));
      alphabet.remove(Character.toString(normalized));
    }

    if (alphabet.size() == 0) {
      System.out.println("pangram");
    } else {
      System.out.println("not pangram");
    }

  }
}
