package hackerrank.algorithms;

/**
 * Created by aandra1 on 01/02/16.
 */

import java.util.Scanner;

/*
Suppose you have a string S that has the length N. It is indexed from 0 to N−1. String R is the reverse of string S.
The string S is funny if the condition |Si−Si−1|=|Ri−Ri−1| is true for every i from 1 to N−1.

Note: Given a string str, stri denotes the ascii value of the ith character (0-indexed) of str. Here, |x| denotes the absolute value of an integer x.

Input Format
The first line of input will contain an integer T, the number of test cases. Each of the next T lines contains one string S.

Constraints:
1⩽T⩽10
2⩽length of S⩽10000

Output Format
For each string, print Funny or Not Funny on separate lines.
Sample Input
2
acxz
bcxz

Sample Output
Funny
Not Funny

Explanation
Consider the 1st test case: acxz

Here:

|c-a| = |x-z| = 2
|x-c| = |c-x| = 21
|z-x| = |a-c| = 2
Hence, the string is Funny.

Consider the 2nd test case: bcxz

Here:

|c-b| != |x-z|
Hence, the string is Not Funny.
*/

public class FunnyString {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);
    int t = Integer.valueOf(in.nextLine());

    for (int k = 0; k < t; k++) {
      char[] phrase = in.nextLine().toCharArray();
      boolean isFunny = true;
      int i = 0;
      int j = phrase.length - 1;
      while (j > (i + 1) && isFunny) {
        if (Math.abs(phrase[i] - phrase[i + 1]) != Math.abs(phrase[j] - phrase[j - 1]))
          isFunny = false;
        i++;
        j--;
      }


      if (isFunny) {
        System.out.println("Funny");
      } else {
        System.out.println("Not Funny");
      }
    }
  }
}
