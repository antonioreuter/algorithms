package hackerrank.algorithms;

import java.util.Scanner;

/**
 * Created by aandra1 on 04/03/16.
 */
public class InsertionSortChallenge1 {

  public static boolean less(Integer a, Integer b) {
    if (a == null || b == null)
      return false;
    else
      return a.compareTo(b) < 0;
  }

  public static void exchange(Integer[] array, int pos1, int pos2) {
    Integer aux = array[pos1];
    array[pos1] = array[pos2];
    array[pos2] = aux;
  }

  public static void printArray(Integer[] a) {
    for (Integer el : a) {
      System.out.print(el + " ");
    }
    System.out.println("");

  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    Integer[] elements = new Integer[size];
    for (int i = 0; i < size; i++) {
      elements[i] = in.nextInt();
    }

    for (int i = 0; i < size; i++) {
      for (int j = i; j > 0 && less(elements[j], elements[j - 1]); j--) {
        exchange(elements, j, j - 1);
      }

      if (i > 0)
        printArray(elements);
    }
  }
}
