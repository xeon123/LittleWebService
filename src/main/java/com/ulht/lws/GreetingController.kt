package com.ulht.lws

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {

    val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "user", defaultValue = "World") name: String) =
            Greeting(counter.incrementAndGet(), "Hello, $name")

    @GetMapping("/buy")
    fun buy(@RequestParam(value = "user", defaultValue = "World") user: String) =
            Greeting(counter.incrementAndGet(), "Hello, $user")

    @GetMapping("/sell")
    fun sell(@RequestParam(value = "user", defaultValue = "World") user: String) =
            Greeting(counter.incrementAndGet(), "Hello, $user")

    @GetMapping("/get")
    fun get(@RequestParam(value = "user", defaultValue = "World") user: String) =
            Greeting(counter.incrementAndGet(), "Hello, $user")

}