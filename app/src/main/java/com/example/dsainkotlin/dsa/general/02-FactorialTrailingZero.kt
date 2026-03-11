package com.example.dsainkotlin.dsa.general

fun main(){
    val number = 10
    println(trailingZeros(number))
}

fun trailingZeros(num: Int): Int {

    var currPowerOfFive = 5
    var count = 0
    while(num >= currPowerOfFive){
        count += (num / currPowerOfFive)
        currPowerOfFive *= 5
    }

    return count

}