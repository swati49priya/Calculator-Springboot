package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CalculatorService {
    public int add(List<Integer> num) {
        int result = num.stream().reduce((a, b) -> a + b).get();
        return result;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public int multiply(List<Integer> num){
        return num.stream().reduce((a, b) -> a * b).get();
    }

    public int divide(int a, int b){
        return a/b;
    }
}
