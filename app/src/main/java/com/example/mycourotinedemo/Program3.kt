package com.example.mycourotinedemo

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.lang.Thread.sleep
import java.util.concurrent.atomic.AtomicInteger
import kotlin.concurrent.thread
import kotlin.coroutines.CoroutineContext


fun main(args: Array<String>) {

    val results = AtomicInteger()

   for (i in 1..500_000)
   {
    GlobalScope.launch{
        delay(100)
        results.getAndIncrement()
    }
   }

    GlobalScope.async {

    }
    sleep(1000)
    println(results.get())
}