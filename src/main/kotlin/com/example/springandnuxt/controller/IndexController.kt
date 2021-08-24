package com.example.springandnuxt.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping


@Controller
class IndexController {

    @GetMapping("")
    fun call(): String {
        return "index.html"
    }
}