package com.example.hellorestapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloRestapiApplication

fun main(args: Array<String>) {
    runApplication<HelloRestapiApplication>(*args)
}
