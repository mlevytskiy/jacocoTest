package com.dpanchyshyn.main

import org.junit.Assert.assertNotNull
import org.junit.Test

class MainTest {

//    private val mainObject = Main(object : TestInterface {
//
//        override fun returnString() = null as String?
//    })

    @Test
    fun readsDefaultValueOfStringAsNullTest() {
        val mainObject = Main()
        assertNotNull(mainObject.readDefaultString())
    }
}