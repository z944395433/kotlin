package com.example.demo.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/sys")
class SystemController{
    @PostMapping("/login.php")
    fun login(): String {
        var hello: String? = null
        hello?.let { println() }
        return "123"
    }

}