package org.zerock.serverex1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("")
    public String[] check() {
        return new String[] {"hello","word"};
    }
}
