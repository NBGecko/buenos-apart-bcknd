package com.reservas.buenosapart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String Inicio() {
        return "Hola Mundo";
    }
}
