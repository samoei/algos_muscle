package com.samphiltech.algos;

/**
 * @author Created by Phil Samoei on 2019-06-01
 * @project algo_muscle
 *
 * This problem was asked by Uber.
 *
 * Given an array of integers, return a new array such that each element at index i of the new array
 * is the product of all the numbers in the original array except the one at i.
 *
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30,
 * 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 *
 * Follow-up: what if you can't use division?
 */
public class ProblemTwo {

  public static int[] productsUsingDiv(int[] numbers) {
    int prod = 1;
    int[] result = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      prod = prod * numbers[i];
    }
    for (int i = 0; i < numbers.length; i++) {
      result[i] = prod/numbers[i];
    }
    return result;
  }

}
