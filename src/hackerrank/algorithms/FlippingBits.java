package hackerrank.algorithms;

import java.util.Scanner;

/**
 * Created by aandra1 on 17/02/16.
 */
public class FlippingBits {

  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());

    for (int i = 0; i < testCases; i++) {
      String num = String.format("%032d", Integer.toBinaryString(in.nextInt()));
      System.out.println(num);
    }

  }
}
