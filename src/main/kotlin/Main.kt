package org.example

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*

fun main() {
    var car: Car = Benz()
    car.drive()

    car = Audi()
    car.drive()

    car = Potter()
    car.drive() //하늘을 날음

    println("hello")
}