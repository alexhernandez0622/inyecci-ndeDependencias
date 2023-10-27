package com.example.controllerenvioDatos.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EjemploController {

    @GetMapping("/saludo")
    public String saludar(@RequestParam("nombre") String nombre) {
        return "¡Hola, " + nombre + "!";
     }
}

