package com.example.dsainkotlin.dsa.leetcode.blind75

import org.junit.Test

class BestMaxProfitStockTest {

    @Test
    fun testBestMaxProfitStock() {
        val prices = intArrayOf(7, 1, 5, 3, 6, 4)
        val expected = 5
        val actual = maxProfit(prices)
        assert(expected == actual)
    }

}