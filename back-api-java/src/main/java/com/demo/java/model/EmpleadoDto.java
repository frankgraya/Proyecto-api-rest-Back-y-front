package com.demo.java.model;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.demo.java.model.Empleado} entity
 */
@Data
public class EmpleadoDto implements Serializable {
    private final long id;
    private final String nombre;
    private final String apellido;
    private final String email;
    private final String image;
}