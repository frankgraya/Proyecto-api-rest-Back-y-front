package com.demo.java.service;

import com.demo.java.model.Persona;
import com.demo.java.model.PersonaDTO;
import com.demo.java.repository.PersonaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Persona crearPersona(Persona persona) {
        log.info("Se crearPersona con exito ");
        return personaRepository.save(persona);
    }

    @Override
    public void borrarPersona(long id) {
        log.info("Se borrarPersona  con exito ");
        personaRepository.deleteById(id);
    }

    @Override
    public List<Persona> listarPersonas() {
        log.info("Se listarPersonas con exito ");
        return personaRepository.findAll();
    }

    @Override
    public Persona buscarPersonaPorID(long id) {
        log.info("Se buscarPersonaPorID con exito ");
        return personaRepository.findById(id).orElse(null);

    }

    @Override
    public void modificarPersona(PersonaDTO personaDTO) {
        Persona persona = new Persona(
                personaDTO.getNombre(),
                personaDTO.getEdad(),
                personaDTO.getTelefono(),
                personaDTO.getDireccion(),
                personaDTO.getCodigoPostal()
        );
        personaRepository.save(persona);
    }


    @Override
    public PersonaDTO verPersona(String nombre) {
        Persona persona = personaRepository.findBynombre(nombre);
        if (persona == null) {
            return null; // O lanzar una excepción u otro manejo de error adecuado
        }
        return new PersonaDTO(
                persona.getId(),
                persona.getNombre(),
                persona.getEdad()
        );
    }


}
