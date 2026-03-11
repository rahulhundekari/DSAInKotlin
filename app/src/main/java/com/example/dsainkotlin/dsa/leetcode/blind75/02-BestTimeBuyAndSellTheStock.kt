package com.example.dsainkotlin.dsa.leetcode.blind75

// TC: O(n), SC: O(1)

/*Practice - Best Time to Buy and Sell Stock
You are given an array prices where prices[i] is the price of a given stock on the ith day.

Your goal is to find the maximum profit you can make by choosing one day to buy a stock and a different future day to sell it.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



Example 1:

Input: prices = [7,1,5,3,6,4]

Output: 5

Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.

Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.



Example 2:

Input: prices = [7,6,4,3,1]

Output: 0

Explanation: In this case, no transactions are done and the max profit = 0.


Constraints:

1 <= prices.length <= 105

0 <= prices[i] <= 104
*/

fun main() {
    val prices = intArrayOf(7, 1, 5, 3, 6, 4)
}

fun maxProfit(prices: IntArray): Int {
    var minProfit = Int.MAX_VALUE
    var maxProfit = 0

    for(price in prices){
        minProfit = minOf(minProfit, price)

        val currentProfit = price - minProfit
        maxProfit = maxOf(currentProfit, maxProfit)
    }

    return maxProfit
}
