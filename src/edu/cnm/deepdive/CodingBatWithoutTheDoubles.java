package edu.cnm.deepdive;

/*

Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true,
if the two dice show the same value, increment one die to the next value,
wrapping around to 1 if its value was 6.

withoutDoubles(2, 3, true) → 5
withoutDoubles(3, 3, true) → 7
withoutDoubles(3, 3, false) → 6
 */

public class CodingBatWithoutTheDoubles {

  public static void main(String[] args) {

    System.out.printf("With the numbers %d and %d and noDoubles set to %s, the outcome will be "
    + withoutDoubles(2, 3, true) + ".\n", 2, 3, true);
    System.out.printf("With the numbers %d and %d and noDoubles set to %s, the outcome will be "
        + withoutDoubles(3, 3, true) + ".\n", 3, 3, true);
    System.out.printf("With the numbers %d and %d and noDoubles set to %s, the outcome will be "
        + withoutDoubles(3, 3, false) + ".\n", 3, 3, true);

  }

  public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
    if (noDoubles) {
      if (die1 == die2) {
        if (die1 < 6) {
          return (die1 * 2 + 1);
        }
        else {
          return (die1 + 1);
        }
      }
      return (die1 + die2);
    }
    return (die1 + die2);
  }

}
