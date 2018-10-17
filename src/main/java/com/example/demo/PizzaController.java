package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment; 

@RestController
public class PizzaController{
    
    @RequestMapping("/pizzas")
    public String getPizzas() {
        return "Pizza's are very good!!";
    }
}
