package interview.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by aandra1 on 04/03/16.
 */
public class QuestionA {

  public static Map<String, Integer> categorizeString(String input) {
    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < input.length(); i++) {
      String el = String.valueOf(input.charAt(i));
      if (map.containsKey(el))
        map.put(el, map.remove(el) + 1);
      else
        map.put(el, 1);
    }

    return map;
  }


  public static int equalizeStrings(Map<String, Integer> setA, Map<String, Integer> setB) {
    int sum = 0;

    for (String key : setA.keySet())
      sum += Math.abs(setA.get(key) - setB.get(key));

    return sum;
  }

  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    String inputA = in.next();
    String inputB = in.next();
    System.out.println(equalizeStrings(categorizeString(inputA), categorizeString(inputB)));
  }
}
