package com.samphiltech.algos;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Created by Phil Samoei on 2019-06-04
 * @project algo_muscle
 */
public class ProblemTwoTest {

  @Test
  public void productsUsingDiv() {
    int[] nums = {1,2,3,4,5};
    int[] expect = {120,60,40,30,24};
    assertArrayEquals(ProblemTwo.productsUsingDiv(nums), expect);
  }

  @Test
  public void productWithoutDiv(){
    int[] nums = {1,2,3,4,5};
    int[] expect = {120,60,40,30,24};
    assertArrayEquals(ProblemTwo.productWithoutDiv(nums, nums.length), expect);
  }
}