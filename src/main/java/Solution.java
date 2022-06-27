import java.util.Arrays;

public class Solution {
  public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
    int[] prices = new int[n];
    Arrays.fill(prices, Integer.MAX_VALUE);
    prices[src] = 0;
    for (int level = 1; level <= k+1; level++) {
      int[] levelPrices = Arrays.copyOf(prices, n);
      for (int[] flight: flights) {
        int source = flight[0];
        int target = flight[1];
        int price = flight[2];
        if (prices[source] == Integer.MAX_VALUE) {
          continue;
        }
        if (levelPrices[target] > prices[source] + price) {
          levelPrices[target] = prices[source] + price;
        }
      }
      // copy current prices to prices
      prices = Arrays.copyOf(levelPrices, n);
    }
    if (prices[dst] == Integer.MAX_VALUE) {
      return -1;
    }
    return prices[dst];
  }
}
