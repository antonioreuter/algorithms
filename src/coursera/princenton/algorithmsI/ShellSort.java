package coursera.princenton.algorithmsI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by aandra1 on 02/03/16.
 */
public class ShellSort {

  public static void sort(Comparable[] a) {
    int N = a.length;

    int h = 1;
    while (h < N / 3) h = 3 * h + 1;

    while (h >= 1) {
      for (int i = h; i < N; i++) {
        for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
          exchange(a, j, j - h);
        }
      }
      h = h / 3;
    }
  }

  public static boolean less(Comparable a, Comparable b) {
    return a.compareTo(b) < 0;
  }

  public static void exchange(Comparable[] a, int pos1, int pos2) {
    Comparable aux = a[pos1];
    a[pos1] = a[pos2];
    a[pos2] = aux;
  }

  public static List<Integer> generateEntries() {
    List<Integer> entry = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    int digit = -1;
    while (digit != 0) {
      digit = in.nextInt();
      entry.add(digit);
    }

    return entry;
  }

  public static void printArray(Comparable[] a) {
    for (Comparable element : a)
      System.out.print(element + ", ");
  }

  public static void main(String args[]) {
    List<Integer> entry = generateEntries();

    Integer[] sortArr = entry.toArray(new Integer[entry.size()]);
    sort(sortArr);
    printArray(sortArr);
  }
}
