package com.example.mycourotinedemo

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.lang.Thread.sleep
import java.sql.Timestamp
import java.util.concurrent.atomic.AtomicInteger
import kotlin.concurrent.thread
import kotlin.coroutines.CoroutineContext


/*val SEQ_THRESHOLD = 5000;
fun main(args: Array<String>) = runBlocking {
    println("Hello World")

}*/

/*
val SEQ_THRESHOLD = 5000;
fun main(args: Array<String>) {


    thread {
        sleep(100)
        print("World")
    }
    println("Hello")

    sleep(1500)
}
*/

fun main(args: Array<String>) {

    val results = AtomicInteger()
    val startTime = System.currentTimeMillis()

    for (i in 1..500_000)
   {
    GlobalScope.launch(Dispatchers.Default){
        results.getAndIncrement()
       // Log.d("TAG", "main: ${this.coroutineContext}")


    }
   }
    val endTime = System.currentTimeMillis()
    sleep(1000)
    println(endTime - startTime)
    println(results.get())
}
