package com.example.dsainkotlin.dsa.leetcode.blind75

// TC: O(n), SC: O(n)

/*Practice - Contains Duplicate
For a given array of integers, nums, return true if it contains duplicates. Otherwise, return false.



Example 1:

Input: nums = [1,2,3,1]

Output: true



Example 2:

Input: nums = [1,2,3,4]

Output: false



Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true*/


fun main() {
    val duplicate = findContainsDuplicate(intArrayOf(1, 2, 1, 5))
    println("Duplicate: $duplicate")
}

fun findContainsDuplicate(numbs: IntArray): Boolean {

    val hasSet = HashSet<Int>()

    for (numb in numbs) {
        if (hasSet.contains(numb)) {
            return true
        }
        hasSet.add(numb)
    }

    return false
}