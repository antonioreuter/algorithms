/*
There are N integers in an array A. All but one integer occur in pairs. Your task is to find the number that occurs only once.

Input Format
The first line of the input contains an integer N, indicating the number of integers. The next line contains N space-separated integers that form the array A.

Constraints
1≤N<100
N % 2=1 (N is an odd number)
0≤A[i]≤100,∀i∈[1,N]

Output Format
Output S, the number that occurs only once.

Sample Input:1
1
1
Sample Output:1 => 1

Sample Input:2
3
1 1 2
Sample Output:2 => 2

Sample Input:3
5
0 0 1 2 1
Sample Output:3 => 2

Explanation
In the first input, we see only one element (1) and that element is the answer.
In the second input, we see three elements; 1 occurs at two places and 2 only once. Thus, the answer is 2.
In the third input, we see five elements. 1 and 0 occur twice. The element that occurs only once is 2.
 */

package hackerrank.algorithms;

/**
 * Created by aandra1 on 01/02/16.
 */

import java.util.Scanner;

public class LonelyInteger {

  static int lonelyInteger(int[] a, int[] entries) {
    for (int i = 0; i < entries.length; i++) {
      if (a[entries[i]] == 1)
        return entries[i];
    }
    return 0;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int res;

    int size = Integer.parseInt(in.nextLine());
    int[] a = new int[100];

    String next = in.nextLine();
    String[] nextInt = next.split(" ");
    int[] entries = new int[size];

    for (int i = 0; i < entries.length; i++) {
      entries[i] = Integer.parseInt(nextInt[i]);
      a[entries[i]] += 1;
    }

    res = lonelyInteger(a, entries);
    System.out.println(res);
  }
}
