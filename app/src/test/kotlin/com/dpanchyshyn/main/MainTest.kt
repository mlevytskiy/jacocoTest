package com.dpanchyshyn.main

import org.junit.Assert.assertEquals
import org.junit.Test

class MainTest {

//    private val mainObject = Main(object : TestInterface {
//
//        override fun returnString() = null as String?
//    })

    @Test
    fun readsDefaultValueOfStringAsNullTest() {
        val mainObject = Main()
        assertEquals("test", mainObject.readDefaultString(""))
    }
}