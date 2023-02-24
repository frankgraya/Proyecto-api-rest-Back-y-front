package com.demo.java.repository;


import com.demo.java.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRespository extends JpaRepository<Empleado,Long> {
}
