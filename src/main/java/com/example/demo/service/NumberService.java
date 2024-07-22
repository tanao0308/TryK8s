package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class NumberService {
    public String IsPrime(int number) {
        for (int i = 2; i * i <= number; ++i) {
            if (number % i == 0) {
                return "Not prime.";
            }
        }
        return "Prime.";
    }
}
