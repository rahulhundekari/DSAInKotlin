 package com.example.dsainkotlin.dsa.general

import java.util.TreeMap

/*To find the lexicographically smallest palindromic permutation of a string, you must ensure that characters are placed in the earliest possible positions in alphabetical order. [1, 2, 3]
## Logic for the Smallest Palindromic Permutation

1. Count Frequencies: Store the count of each character using a frequency array or map.
2. Verify Palindrome Potential: A palindrome can only be formed if at most one character has an odd frequency.
3. Construct the First Half: Iterate from 'a' to 'z' and append each character to a StringBuilder exactly half of the times it appears in the string.
4. Identify the Middle: If a character has an odd count, it must be placed in the center.
5. Assemble: The final string is the First Half + Middle Character (if any) + Reversed First Half. [4, 5, 6, 7, 8, 9]

## Kotlin Implementation
You can use a simple [Frequency Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/) to track character counts: [10]

## Example Walkthrough
For the input s = "aabbcc":

* Frequencies: a:2, b:2, c:2.
* First Half: Appends 'a', then 'b', then 'c' once each $\rightarrow$ "abc".
* Result: "abc" + "" + "cba" = "abccba".

For the input s = "abcba":

* Frequencies: a:2, b:2, c:1.
* First Half: Appends 'a', then 'b' once each $\rightarrow$ "ab".
* Mid: 'c'.
* Result: "ab" + "c" + "ba" = "abcba". [11]
*/

fun smallestPalindromePermutation(s: String): String{

    val freq = IntArray(26)
    for(char in s){
        freq[char - 'a']++
    }

    var oddCount = 0
    var midChar = ""
    val half = StringBuilder()

    // Build the lexicographically smallest first half
    for (i in 0 until 26){
        val char = (i + 'a'.code).toChar()
        if (freq[i] % 2 !=0){
            oddCount++
            midChar = char.toString()
        }

        // Append half of the occurrences
        repeat(freq[i] % 2){
            half.append(char)
        }
    }

    if (oddCount > 1) return ""

    val firstHalf = half.toString()
    return firstHalf + midChar + firstHalf.reversed()
}


/*
* handle strings with special characters or numbers
*
* Example with Numbers & Symbols
* For the input s = "12!21!":
* 1. Frequencies: ! : 2, 1 : 2, 2 :  2.
* 2. Sorted Order: !, then 1, then 2.
* 3. Result: "!1221!".
*
* */

fun smallestPalindromePermutationUniversal(s: String): String{
    val freq = TreeMap<Char, Int>()
    for(char in s){
        freq[char] = freq.getOrDefault(char, 0) + 1
    }

    var oddCount = 0
    var midChar = ""
    val half = StringBuilder()

    // Iterate through the sorted map
    for((char, count) in freq){
        if(count % 2 != 0){
            oddCount++
            midChar = char.toString()
        }

        // Append exactly half of the character occurrences
        repeat(count / 2){
            half.append(char)
        }
    }


    // A palindrome permutation is impossible if more than one char has an odd count
    if (oddCount > 1) return ""

    val firstHalf = half.toString()
    return firstHalf + midChar + firstHalf.reversed()
}