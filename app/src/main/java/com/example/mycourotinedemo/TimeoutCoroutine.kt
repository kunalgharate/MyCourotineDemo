package com.example.mycourotinedemo

import android.util.Log
import kotlinx.coroutines.*


fun main(args: Array<String>) = runBlocking {


    val job = withTimeoutOrNull(100) {

        repeat(100000)
        {
            try {
                yield()
                print(".")
                Thread.sleep(1)
            } catch (x: CancellationException) {
              return@withTimeoutOrNull  println(" catch block ${x.localizedMessage}")
            }


        }
    }

    if (job==null)
    {
        println("TimeOut")
    }

    delay(200)



    println("Done")
}