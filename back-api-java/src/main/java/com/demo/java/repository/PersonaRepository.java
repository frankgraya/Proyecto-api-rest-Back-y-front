package com.demo.java.repository;

import com.demo.java.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    public Persona findBynombre(String nombre);

}
