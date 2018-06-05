package com.dpanchyshyn.extensions

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.util.HashMap

class EmptyInvocationHandler : InvocationHandler {

    @Throws(Throwable::class)
    override fun invoke(proxy: Any?, method: Method, args: Array<Any>?): Any? {
        val returnType = method.returnType
        return if (returnType.isPrimitive) {
            DEFAULT_VALUES[returnType]
        } else null
    }

    companion object {

        private val DEFAULT_VALUES = HashMap<Class<*>?, Any>(8)

        init {
            DEFAULT_VALUES[Boolean::class.javaPrimitiveType] = false
            DEFAULT_VALUES[Byte::class.javaPrimitiveType] = 0.toByte()
            DEFAULT_VALUES[Short::class.javaPrimitiveType] = 0.toShort()
            DEFAULT_VALUES[Int::class.javaPrimitiveType] = 0
            DEFAULT_VALUES[Long::class.javaPrimitiveType] = 0L
            DEFAULT_VALUES[Float::class.javaPrimitiveType] = 0f
            DEFAULT_VALUES[Double::class.javaPrimitiveType] = 0.0
            DEFAULT_VALUES[Char::class.javaPrimitiveType] = '\u0000'
        }
    }
}