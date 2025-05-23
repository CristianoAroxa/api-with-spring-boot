package br.com.aroxa.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MathController {

    @GetMapping("/teste")
    public String teste() {
        return "Endpoint Teste";
    }
    

}
