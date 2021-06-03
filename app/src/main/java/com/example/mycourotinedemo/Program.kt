package com.example.mycourotinedemo

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.lang.Thread.sleep
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

val SEQ_THRESHOLD = 5000;

fun main(args: Array<String>) {


    GlobalScope.launch(Dispatchers.IO) {
        delay(10000)
        print("World")
    }

    thread {

    }
    println("Hello")

    sleep(1500)
}