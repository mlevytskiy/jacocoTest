package com.dpanchyshyn.extensions

import java.lang.reflect.Proxy.newProxyInstance

inline fun <reified T : Any> inferNoOp(): T {
    val classToInfer = T::class.java
    return newProxyInstance(
        classToInfer.classLoader,
        arrayOf(classToInfer),
        EmptyInvocationHandler()
    ) as T
}

