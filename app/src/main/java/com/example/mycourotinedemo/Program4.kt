package com.example.mycourotinedemo

import kotlinx.coroutines.*
import java.lang.Thread.sleep
import java.util.concurrent.atomic.AtomicInteger
import kotlin.concurrent.thread
import kotlin.coroutines.CoroutineContext


fun main(args: Array<String>) {

    val results = AtomicInteger()

    GlobalScope.launch{
        delay(100)
        results.getAndIncrement()
        println("Launch")
    }



    //Coroutine scope
    GlobalScope.async {
        delay(1000)
            println("Async")
    }

    println(results.get())
    println("Hello ,")


    //Blocking main thread
    runBlocking {
        delay(1000)
        println("World")
    }
}