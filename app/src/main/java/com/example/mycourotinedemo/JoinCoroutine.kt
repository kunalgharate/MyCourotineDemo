package com.example.mycourotinedemo

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking



fun main(args: Array<String>)  = runBlocking{


    val job = launch {
        delay(5000)
        print("World")
    }



    println("Hello")
    job.join()
}