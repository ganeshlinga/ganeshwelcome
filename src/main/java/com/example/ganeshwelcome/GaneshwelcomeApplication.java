package com.example.ganeshwelcome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GaneshwelcomeApplication {

    @GetMapping("/Welcome")
    public String Welcome() {
        return "GaneshWelcomes";
    }
    public static void main(String[] args) {
        SpringApplication.run(GaneshwelcomeApplication.class, args);
    }

}
