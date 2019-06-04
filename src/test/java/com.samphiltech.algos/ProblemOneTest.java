package com.samphiltech.algos;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemOneTest extends TestCase {

    @Test
    public void testAddUp() {
        int nums[] = {10, 15, 3, 7};

        assertTrue(ProblemOne.addUp(nums,17));
        assertFalse(ProblemOne.addUp(nums,7));

    }

    @Test
    public void testAddUpEfficient() {
        int nums[] = {10,0};
        assertTrue(ProblemOne.addUpEfficient(nums,10));
        assertFalse(ProblemOne.addUpEfficient(nums,3));
    }
}