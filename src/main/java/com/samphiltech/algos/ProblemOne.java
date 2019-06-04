package com.samphiltech.algos;

import java.util.HashSet;

/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to
 * k.
 *
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 *
 * Bonus: Can you do this in one pass?
 */
public class ProblemOne {

  public static boolean addUp(int[] numbers, int constant) {
    boolean addsUp = false;
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers.length; j++) {
        if (numbers[i] + numbers[j] == constant) {
          addsUp = true;
          break;
        }
      }
    }
    return addsUp;
  }

  public static boolean addUpEfficient(int[] numbers, int constant) {
    boolean addsUp = false;
    HashSet<Integer> hashSet = new HashSet<Integer>();

    for (int i = 0; i < numbers.length; i++) {
      if (hashSet.contains(constant - numbers[i])) {
        addsUp = true;
      }
      hashSet.add(numbers[i]);
    }

    return addsUp;

  }


}
