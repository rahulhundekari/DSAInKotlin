package com.example.dsainkotlin.dsa.general

import org.junit.Test

class TrailingZerosTest {

    @Test
    fun testTrailingZeros() {
        val n = 5
        val expected = 1
        val actual = trailingZeros(n)
        assert(expected == actual)
    }

    @Test
    fun testTrailingZerosTest2() {
        val n = 10
        val expected = 2
        val actual = trailingZeros(n)
        assert(expected == actual)
    }

}