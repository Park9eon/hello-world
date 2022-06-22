package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
open class Application {

    @GetMapping("/")
    fun index(): String {
        return "Hello, World!"
    }

}

fun main() {
    runApplication<Application>()
}