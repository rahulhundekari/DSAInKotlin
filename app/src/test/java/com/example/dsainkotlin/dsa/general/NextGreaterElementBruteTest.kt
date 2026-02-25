package com.example.dsainkotlin.dsa.general

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class NextGreaterElementBruteTest {

    @Test
    fun shouldReturnNextGreaterElement() {
        val inputArray = intArrayOf(1, 3, 2, 4)
        val result = intArrayOf(3, 4, 4, -1)
        assertArrayEquals(result, nextGreaterElementBrute(inputArray))
    }

    @Test
    fun shouldReturnNextGreaterElement2() {
        val inputArray = intArrayOf(9, 1, 5, 2, 6, 3)
        val result = intArrayOf(-1, 5, 6, 6, -1, -1)
        assertArrayEquals(result, nextGreaterElementBrute(inputArray))
    }
}