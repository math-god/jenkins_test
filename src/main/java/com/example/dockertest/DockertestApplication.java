package com.example.dockertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DockertestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockertestApplication.class, args);
    }

    @RestController
    public static final class HelloWorldController {

        @GetMapping("/")
        public String helloWorld() {
            return "Hello from Java!";
        }
    }
}
