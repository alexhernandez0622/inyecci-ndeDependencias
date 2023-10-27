package com.example.manejarPeticiones.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Usuario {

    @NotBlank(message = "El nombre no puede estar en blanco")
    private String nombre;

    @Email(message = "El email no es válido")
    private String email;

}
