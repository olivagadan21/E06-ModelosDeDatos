package com.salesianos.triana.dam.ejercicio2.service;

import com.salesianos.triana.dam.ejercicio2.model.Profesor;
import com.salesianos.triana.dam.ejercicio2.repos.ProfesorRepository;
import com.salesianos.triana.dam.ejercicio2.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ProfesorService extends BaseService<Profesor, Long, ProfesorRepository> {

    public ProfesorService(ProfesorRepository repo) {
        super(repo);
    }

}
