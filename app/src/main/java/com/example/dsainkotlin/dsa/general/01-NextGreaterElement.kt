package com.example.dsainkotlin.dsa.general

/*
*
*
*
* For each element in array, find the next greater element on the right.
If none exists → return -1.

Example:

Input:  [1, 3, 2, 4]
Output: [3, 4, 4, -1]

❌ Brute Force (O(n²)) – Not Recommended

For each element → check all elements on right.

Too slow for large input.

✅ Optimal Solution – Using Stack (O(n))
💡 Idea

Traverse from right to left

Maintain a monotonic decreasing stack

Stack stores potential next greater elements

Why right to left?
Because we need future elements.
*
* */

fun main() {
    val inputArray = intArrayOf(1, 3, 2, 4)
    val result = nextGreaterElement(inputArray)
    println(result.contentToString())
}


/*
*  Using Stack (O(n))
* */

fun nextGreaterElement(nums: IntArray): IntArray {

    val n = nums.size
    val result = IntArray(n) { -1 }
    val stack = ArrayDeque<Int>()

    for (i in n - 1 downTo 0) {

        // Remove smaller or equal element
        while (stack.isNotEmpty() && stack.last() <= nums[i]) {
            stack.removeLast()
        }

        // If stack empty → no greater element
        result[i] = if (stack.isNotEmpty()) stack.last() else -1

        // Push current element
        stack.addLast(nums[i])
    }

    return result
}

/*
* Brute Force (O(n²)) – Not Recommended
* */

fun nextGreaterElementBrute(nums: IntArray): IntArray {
    val result = IntArray(nums.size) { -1 }

    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[j] > nums[i]) {
                result[i] = nums[j]
                break
            }
        }
    }

    return result
}

