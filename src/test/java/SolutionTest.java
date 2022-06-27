import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void findCheapestPriceExample1() {
    assertEquals(700, sol.findCheapestPrice(
        4,
        new int[][]{
            {0,1,100},
            {1,2,100},
            {2,0,100},
            {1,3,600},
            {2,3,200},
        },
        0,
        3,
        1
    ));
  }
  @Test
  void findCheapestPriceExample2() {
    assertEquals(200, sol.findCheapestPrice(
        3,
        new int[][]{
            {0,1,100},
            {1,2,100},
            {0,2,500}
        },
        0,
        2,
        1
    ));
  }
  @Test
  void findCheapestPriceExample3() {
    assertEquals(500, sol.findCheapestPrice(
        3,
        new int[][]{
            {0,1,100},
            {1,2,100},
            {0,2,500}
        },
        0,
        2,
        0
    ));
  }
}