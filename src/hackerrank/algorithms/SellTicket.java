package hackerrank.algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by aandra1 on 24/02/16.
 */
public class SellTicket {

  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    Integer n = in.nextInt();
    Integer m = in.nextInt();

    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = in.nextInt();
    }
    Arrays.sort(a);
    int max = n - 1;
    int maxRevenue = 0;
    int maxValue = 0;
    int k = 0;
    while (k < m) {
      int index = max;
      maxValue = a[max];
      while (index >= 0 && k < m && a[index] == maxValue) {
        maxRevenue += a[index];
        k++;
        a[index] -= 1;
        index--;
      }
    }
    System.out.println(maxRevenue);
  }
}
