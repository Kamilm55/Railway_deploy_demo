package com.example.railway_deploy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RailwayDeployApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RailwayDeployApplication.class, args);
    }

    @Override
    public void run(String... args)  {
        System.out.println("App works");
    }
}
