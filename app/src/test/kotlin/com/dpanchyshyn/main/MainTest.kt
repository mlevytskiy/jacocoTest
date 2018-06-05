package com.dpanchyshyn.main

import com.dpanchyshyn.extensions.inferNoOp
import org.junit.Assert.assertNull
import org.junit.Test

class MainTest {

//    private val mainObject = Main(object : TestInterface {
//
//        override fun returnString() = null as String?
//    })

    private val mainObject = Main(inferNoOp())

    @Test
    fun readsDefaultValueOfStringAsNull() {
        assertNull(mainObject.readDefaultString())
    }
}