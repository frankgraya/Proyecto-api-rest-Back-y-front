package com.demo.java.service;

import com.demo.java.model.Persona;
import com.demo.java.model.PersonaDTO;

import java.util.List;

public interface PersonaService {

    Persona crearPersona(Persona persona);

    void borrarPersona(long id);

    List<Persona> listarPersonas();

    Persona buscarPersonaPorID(long id);

    void modificarPersona(PersonaDTO personaDTO);

    PersonaDTO verPersona(String nombre);
}
