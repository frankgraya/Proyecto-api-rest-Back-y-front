package com.demo.java.rest_controller;


import com.demo.java.model.Empleado;
import com.demo.java.repository.EmpleadoRespository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/api/")
public class EmpleadoRestController {

    @Autowired
    private EmpleadoRespository empleadoRespository;

    @GetMapping("/empleado")
    public List<Empleado> listarTodosLosEmpleados() {
        log.info("Controller listar todos los empleados { }");
        return empleadoRespository.findAll();
    }
}
