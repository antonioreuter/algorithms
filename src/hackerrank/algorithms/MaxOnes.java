package hackerrank.algorithms;

/**
 * Created by aandra1 on 01/02/16.
 */
public class MaxOnes {

  static int[] calculateIndex(int[] entries) {
    int maxZerosGlobal = 0;
    int indexStartGlobal = 0;
    int indexEndGlobal = 0;

    for (int i = 0; i < entries.length; i++) {
      int maxZeros = 0;
      int maxAux = 0;
      int indexStart = -1;
      int indexEnd = -1;

      for (int j = i; j < entries.length; j++) {
        if (entries[j] == 0) {
          if (indexStart == -1) {
            indexStart = j;
            indexEnd = j;
            maxZeros += 1;
            maxAux += 1;
          } else {
            maxAux += 1;
            if (maxAux > maxZeros) {
              indexEnd = j;
              maxZeros = maxAux;
            }
          }
        } else {
          maxAux -= 1;
        }
      }

      if (maxZeros > maxZerosGlobal) {
        indexStartGlobal = indexStart;
        indexEndGlobal = indexEnd;
        maxZerosGlobal = maxZeros;
      }
    }
    return new int[]{indexStartGlobal, indexEndGlobal};
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
