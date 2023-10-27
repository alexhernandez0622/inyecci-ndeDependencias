package com.example.controllerbasico.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EjemploController {

    @GetMapping("/saludo")
    public String saludar() {
        return "¡Bienvenidos a Spring Boot!";
    }
}
