package com.example.dsainkotlin.dsa.general

fun main(){
    val number = 10
    println(trailingZeroesInFactorial(number))
}

fun trailingZeroesInFactorial(num: Int): Int {

    var currPowerOfFive = 5
    var count = 0
    while(num >= currPowerOfFive){
        count += (num / currPowerOfFive)
        currPowerOfFive *= 5
    }

    return count

}