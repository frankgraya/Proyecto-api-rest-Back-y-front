package com.demo.java.rest_controller;


import com.demo.java.model.Persona;
import com.demo.java.model.PersonaDTO;
import com.demo.java.service.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/api/")
@RestController
public class PersonaRestController {

    @Autowired
    private PersonaService personaService;

    //Create
    @PostMapping("/persona")
    @ResponseBody
    public Persona crearPersona(@RequestBody PersonaDTO personaDTO) {
        Persona persona = new Persona();
        persona.setNombre(personaDTO.getNombre());
        persona.setDireccion(personaDTO.getDireccion());
        persona.setEdad(personaDTO.getEdad());
        persona.setCodigoPostal(personaDTO.getCodigoPostal());
        return personaService.crearPersona(persona);
    }

    //Read
    @GetMapping("/persona")
    @ResponseBody
    public List<Persona> listarPersona() {
        log.info("Se listarPersona Controller con exito ");
        return personaService.listarPersonas();
    }

    //update
    @PutMapping("/persona")
    public void modificarPersona(@RequestBody PersonaDTO personaDTO) {
        log.info("Se modificarPersona Controller con exito ");
        personaService.modificarPersona(personaDTO);
    }

    //Delete
    @DeleteMapping("/persona/{id}")
    public void borrarPersona(@PathVariable long id) {
        log.info("Se borrarHumano Controller con exito");
        personaService.borrarPersona(id);
    }

    //DTO
    @PostMapping("/personadto")
    public PersonaDTO verDTO(@RequestBody PersonaDTO personaDTO) {
        log.info("Se PersonaDTO Controller con exito ");
        return personaService.verPersona(personaDTO.getNombre());
    }
}
