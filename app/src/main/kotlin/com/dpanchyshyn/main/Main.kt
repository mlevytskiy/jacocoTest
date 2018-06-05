package com.dpanchyshyn.main

class Main(private val testValue: TestInterface) {

    fun readDefaultString() = testValue.returnString()
}