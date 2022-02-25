package com.example.demo;

import org.springframework.boot.CommandLineRunner;

public class OpenBrowser implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Runtime.getRuntime().exec("cmd /c start http://localhost:8080/");
    }

}
