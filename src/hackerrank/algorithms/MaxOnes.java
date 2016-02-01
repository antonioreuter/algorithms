package hackerrank.algorithms;

/**
 * Created by aandra1 on 01/02/16.
 */
public class MaxOnes {

  static int[] calculateIndex(int[] entries) {
    int maxZeros = 0;
    int maxAux = 0;
    int indexStart = -1;
    int indexEnd = -1;
    for (int i = 0; i < entries.length; i++) {
      if (entries[i] == 0) {
        if (indexStart == -1) {
          indexStart = i;
          indexEnd = i;
          maxZeros += 1;
          maxAux += 1;
        } else {
          maxAux += 1;
          if (maxAux > maxZeros) {
            indexEnd = i;
            maxZeros = maxAux;
          }
        }
      } else {
        maxAux -= 1;
      }
    }
    return new int[]{indexStart, indexEnd};
  }

  static int countOnes(int[] entries, int[] indexes) {
    int total = 0;
    int start = indexes[0];
    int end = indexes[1];
    for (int i = 0; i < entries.length; i++) {
      if (i >= start && i <= end) {
        if (entries[i] == 0)
          total++;
      } else {
        if (entries[i] == 1) {
          total++;
        }
      }
    }

    return total;
  }

  public static void main(String args[]) throws Exception {
    int[] entries = new int[]{0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0};
    int[] indexes = calculateIndex(entries);
    int total = countOnes(entries, indexes);
    System.out.println(total);
  }
}
