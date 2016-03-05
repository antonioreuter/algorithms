package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aandra1 on 01/03/16.
 */

public class Main {

  public static void main(String[] args) throws Exception {
    List<Character> result = new ArrayList<>();
    String S = "0 - 22 1985--324";
    S = S.replace("-", "").replace(" ", "");
    int total = 0;
    char[] phoneArr = S.toCharArray();
    int phoneSize = phoneArr.length;

    for (int i = 0; i < phoneSize; i++) {
      if (total == 3) {
        result.add('-');
        total = 0;
      }

      result.add(phoneArr[i]);
      total++;
    }

    if (phoneSize % 3 == 1) {
      int pos = result.size() - 1;
      char aux = result.get(pos - 2);
      result.set(pos - 2, '-');
      result.set(pos - 1, aux);
    }

    StringBuilder resp = new StringBuilder();
    for (Character c : result)
      resp.append(c);

    System.out.println(resp.toString());
  }
}
