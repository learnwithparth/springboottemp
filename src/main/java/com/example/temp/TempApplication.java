package com.example.temp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TempApplication {

    @GetMapping("/")
    public String index(){
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(TempApplication.class, args);
    }

}
