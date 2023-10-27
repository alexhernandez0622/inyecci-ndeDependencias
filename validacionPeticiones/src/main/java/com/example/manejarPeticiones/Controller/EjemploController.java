package com.example.manejarPeticiones.Controller;

import com.example.manejarPeticiones.Entity.Usuario;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
public class EjemploController {

    @PostMapping("/usuarios")
    public ResponseEntity<String> crearUsuario(@Valid @RequestBody Usuario usuario) {
        return ResponseEntity.status(HttpStatus.CREATED).body("Usuario creado correctamente:\nNombre: " +
                usuario.getNombre() + "\nEmail: " + usuario.getEmail());
    }
}
