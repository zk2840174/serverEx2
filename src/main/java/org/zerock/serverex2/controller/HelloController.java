package org.zerock.serverex1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api/sample")
public class HelloController {

    @GetMapping("hello")
    public String[] hello() {

        long time = System.currentTimeMillis();

        return new String[] { "Hello World", Long.toString(time) };
    }

    @GetMapping("hello2")
    public String[] hello2() {

        long time = System.currentTimeMillis();

        return new String[] { "Hello World", new Date().toString() };
    }
}
