package com.develhope.demowebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HelloWorldController {

    //senza parametri
    @GetMapping("/ciaoNormal")
    public String saluto(){
        return "Ciao";
    }

    //con parametri
    @GetMapping("/ciaoParam")
    public String saluto(@RequestParam String nome) {
        return "Ciao, " + nome;
    }
}
