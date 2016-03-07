package hackerrank.algorithms;

import java.util.Scanner;

/**
 * Created by aandra1 on 04/03/16.
 * <p>
 * Solution for algorithm: https://www.hackerrank.com/challenges/the-grid-search
 */
public class GridSearch {

  /**
   * 1
   * 2 6
   * 999999
   * 121211
   * 2 2
   * 99
   * 11
   */

  public static String[][] initMatrix(Scanner in, int rows, int cols) {
    String matrix[][] = new String[rows][cols];
    for (int i = 0; i < rows; i++) {
      char[] elements = in.next().toCharArray();
      for (int j = 0; j < cols; j++)
        matrix[i][j] = String.valueOf(elements[j]);
    }

    return matrix;
  }

  public static boolean searchPattern(String[][] source, String[][] target, int pivotRow, int pivotCol) {
    int rows = target.length;
    int cols = target[0].length;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (!source[pivotRow + i][pivotCol + j].equals(target[i][j])) {
          return false;
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int a0 = 0; a0 < t; a0++) {
      int R = in.nextInt();
      int C = in.nextInt();
      String matrix[][] = initMatrix(in, R, C);


      int r = in.nextInt();
      int c = in.nextInt();
      String pattern[][] = initMatrix(in, r, c);

      int I = 0;
      boolean patternFounded = false;
      while (I < R && (R - I) >= r) {
        int J = 0;
        while (J < C && (C - J) >= c) {
          if (matrix[I][J].equals(pattern[0][0])) {
            patternFounded = searchPattern(matrix, pattern, I, J);
            if (patternFounded)
              break;
          }

          J++;
        }

        if (patternFounded)
          break;

        I++;
      }

      if (patternFounded)
        System.out.println("YES");
      else
        System.out.println("NO");
    }
  }

}
