package interview.algorithms;

import java.util.Random;

/**
 * Created by aandra1 on 04/03/16.
 */
public class QuestionB {

  public static void main(String[] args) throws Exception {
    Random random = new Random();
    int[] priceHistory = new int[10];
    for (int i = 0; i < 10; i++)
      priceHistory[i] = random.nextInt((100 - 1) + 1) + 1;

    int bestDayToBuy = 0;
    int bestDayToSell = 0;
    int smallestPrice = 0;
    int greatestPrice = 0;
    int priceGram = 0;
    for (int i = 0; i < priceHistory.length; i++) {
      priceGram = priceHistory[i];
      if (i == 0) {
        smallestPrice = priceGram;
        greatestPrice = priceGram;
        bestDayToBuy = i;
        bestDayToSell = i;
      } else {
        if (priceGram < smallestPrice) {
          smallestPrice = priceGram;
          bestDayToBuy = i;
        }

        if (priceGram > greatestPrice) {
          greatestPrice = priceGram;
          bestDayToSell = i;
        }
      }
    }

    int totalGoldGramBought = 100;
    int maxProfit = (totalGoldGramBought * greatestPrice) - (totalGoldGramBought * smallestPrice);
    System.out.format("Best day to buy %d with gold gram at %d\n", bestDayToBuy, smallestPrice);
    System.out.format("Best day to sell %d with the gold gram at %d\n", bestDayToSell, greatestPrice);
    System.out.format("Buying %d of gold at %d you can earn %d selling them all at day %d ", totalGoldGramBought, bestDayToBuy, maxProfit, bestDayToSell);
  }

}
