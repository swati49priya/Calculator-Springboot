package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/hello")
    public String hello()
    {
        return "Hello";
    }
    @PostMapping("/add")
    public int add(@RequestBody List<Integer> num) {
        return calculatorService.add(num);
    }

    @PostMapping("/subtract")
    public int subtract(@RequestBody Data data){
        return calculatorService.subtract(data.getA(), data.getB());
    }

    @PostMapping("/multiply")
    public int multiply(@RequestBody List<Integer> num) {
        return calculatorService.multiply(num);
    }

    @PostMapping("/divide")
    public int divide(@RequestBody Data data){
        return calculatorService.divide(data.getA(), data.getB());
    }


}
