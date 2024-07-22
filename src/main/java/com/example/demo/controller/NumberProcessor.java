package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.NumberService;

@RestController
@RequestMapping("/api")
public class NumberProcessor {

    @Autowired
    private NumberService numberService;

    @PostMapping("/number")
    public String processNumber(@RequestParam int number) {
        return numberService.IsPrime(number);
    }
}
