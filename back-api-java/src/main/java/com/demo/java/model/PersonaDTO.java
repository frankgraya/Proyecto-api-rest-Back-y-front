package com.demo.java.model;

import java.io.Serializable;

public class PersonaDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private String nombre;
    private int edad;
    private String direccion;
    private long telefono;
    private long codigoPostal;

    public PersonaDTO() {
    }

    public PersonaDTO(long id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public PersonaDTO( String nombre, int edad, String direccion, long telefono, long codigoPostal) {

        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.codigoPostal = codigoPostal;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public long getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(long codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
