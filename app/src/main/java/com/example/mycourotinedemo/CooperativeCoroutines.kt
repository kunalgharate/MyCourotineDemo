package com.example.mycourotinedemo

import kotlinx.coroutines.*


fun main(args: Array<String>) = runBlocking {


    val job = launch {
        repeat(100000)
        {
            try {
                yield()
                print(".")
                Thread.sleep(10)
            }catch (x:CancellationException)
            {
             println(" catch block ${x.localizedMessage}" )
                return@launch     cancel(x)
            }

        }

    }

    delay(200)
    job.cancel("Cancellled")
 //   job.join()



    println("Done")
}