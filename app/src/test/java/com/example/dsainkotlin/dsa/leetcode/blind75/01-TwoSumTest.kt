package com.example.dsainkotlin.dsa.leetcode.blind75

import org.junit.Test
import org.junit.Assert.assertArrayEquals

class TwoSumTest {

    @Test
    fun testTwoSumCase1() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        val expected = intArrayOf(0, 1)
        val result = twoSum(nums, target)
        assertArrayEquals(expected, result)
    }

    @Test
    fun testTwoSumCase2() {
        val nums = intArrayOf(3, 2, 4)
        val target = 6
        val expected = intArrayOf(1, 2)
        val result = twoSum(nums, target)
        assertArrayEquals(expected, result)
    }
}