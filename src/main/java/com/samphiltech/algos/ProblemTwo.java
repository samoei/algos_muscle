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

    //construct the products array
    for (int i = 0; i < numbers.length; i++) {
      prod = prod * numbers[i];
    }

    //divide with the index at i to get the final array
    for (int i = 0; i < numbers.length; i++) {
      result[i] = prod / numbers[i];
    }
    return result;
  }


  /**
   * Algorithm:
   * 1) Construct a temporary array left[] such that left[i] contains product of all elements on
   * left of arr[i] excluding arr[i].
   *
   * 2) Construct another temporary array right[] such that right[i] contains product of all
   * elements on on right of arr[i] excluding arr[i].
   *
   * 3) To get prod[], multiply left[] and right[].
   *
   * @param numbers input array
   * @param arrayLen lenght of the input array
   * @return returns product array
   */
  public static int[] productWithoutDiv(int[] numbers, int arrayLen) {
    // initialize all the arrays
    int[] left = new int[arrayLen];
    int[] right = new int[arrayLen];
    int[] prod = new int[arrayLen];

    //left most element of the left array is always 1 (First element)
    left[0] = 1;

    //right most element of the right array is always 1 (Last element)
    right[arrayLen - 1] = 1;

    //construct the left array
    for (int i = 1; i < arrayLen; i++) {
      left[i] = numbers[i - 1] * left[i - 1];
    }
    //construct the right array
    for (int j = arrayLen - 2; j>=0; j--) {
      right[j] = numbers[j + 1] * right[j + 1];
    }
    //construct the prod array
    for (int k = 0; k < arrayLen; k++) {
      prod[k] = left[k] * right[k];
    }

    return prod;
  }


}
