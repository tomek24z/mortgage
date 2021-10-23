package com.tz.mortgage;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MortgageApplication {

    @RequestMapping("/")
    public String mainMethod() {
        return "Welcome in Mortgage App !";
    }


    public static void main(String[] args) {
        SpringApplication.run(MortgageApplication.class, args);
    }

}


