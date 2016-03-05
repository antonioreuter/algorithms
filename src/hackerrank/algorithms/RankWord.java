package hackerrank.algorithms;

import java.math.BigInteger;
import java.util.*;

/**
 * Created by aandra1 on 24/02/16.
 */
public class RankWord {

  static BigInteger factorial(BigInteger n) {
    BigInteger result = BigInteger.ONE;
    while (!n.equals(BigInteger.ONE)) {
      result = result.multiply(n);
      n = n.subtract(BigInteger.ONE);
    }

    return result;
  }

  static int[] get_ranks(String[] words) {
    List<Integer> results = new ArrayList<>();
    for (String word : words) {
      char[] charArr = word.toCharArray();
      Arrays.sort(charArr);
      List<Character> lista = new LinkedList<>();
      for (int i = 0; i < charArr.length; i++)
        lista.add(charArr[i]);

      int pos = 0;
      int aux = 0;
      for (int i = 0; i < word.length(); i++) {
        aux = efforts_to_move(word.charAt(i), lista);
        pos = pos + aux;
      }
      results.add(pos);

    }
    int[] valor = new int[results.size()];
    int k = 0;
    for (Integer v : results)
      valor[k++] = v;

    return valor;
  }

  static int efforts_to_move(char letter, List<Character> lista) {
    Map<Character, Integer> map = new HashMap<>();
    int index = 0;
    for (int i = 0; i < lista.size(); i++) {
      Character c = lista.get(i);
      index++;

      if (!map.containsKey(c))
        map.put(c, 1);
      else
        map.put(c, map.remove(c) + 1);

      if (letter == c.charValue())
        break;

    }
    return permutationValue(index, map.values());
  }

  static int permutationValue(Integer index, Collection<Integer> values) {
    BigInteger dividendo = factorial(new BigInteger(index.toString()));
    BigInteger divisor = BigInteger.ONE;
    for (Integer v : values) {
      divisor = divisor.multiply(factorial(new BigInteger(v.toString())));
    }
    return dividendo.divide(divisor).intValue();
  }

  public static void main(String[] args) {
    System.out.println(get_ranks(new String[]{"casa"}));

  }

//  public static void main(String[] args) throws IOException {
//    Scanner in = new Scanner(System.in);
//    final String fileName = System.getenv("OUTPUT_PATH");
//    BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
//    int[] res;
//
//    int _words_size = Integer.parseInt(in.nextLine());
//    String[] _words = new String[_words_size];
//    String _words_item;
//    for (int _words_i = 0; _words_i < _words_size; _words_i++) {
//      try {
//        _words_item = in.nextLine();
//      } catch (Exception e) {
//        _words_item = null;
//      }
//      _words[_words_i] = _words_item;
//    }
//
//    res = get_ranks(_words);
//    for (int res_i = 0; res_i < res.length; res_i++) {
//      bw.write(String.valueOf(res[res_i]));
//      bw.newLine();
//    }
//
//    bw.close();
//  }

}
