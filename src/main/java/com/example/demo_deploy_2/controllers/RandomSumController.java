package com.example.demo_deploy_2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RandomSumController {

    @GetMapping("/sum")
    public String getRandomSum() {
        Random random = new Random();
        int num1 = random.nextInt(100);  // Genera un numero casuale tra 0 e 99
        int num2 = random.nextInt(100);  // Genera un altro numero casuale tra 0 e 99
        int sum = num1 + num2;
        return "La somma di " + num1 + " e " + num2 + " è: " + sum;
    }
}