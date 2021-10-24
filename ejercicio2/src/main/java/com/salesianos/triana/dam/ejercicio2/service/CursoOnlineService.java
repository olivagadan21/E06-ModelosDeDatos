package com.salesianos.triana.dam.ejercicio2.service;

import com.salesianos.triana.dam.ejercicio2.model.CursoOnline;
import com.salesianos.triana.dam.ejercicio2.repos.CursoOnlineRepository;
import com.salesianos.triana.dam.ejercicio2.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class CursoOnlineService extends BaseService<CursoOnline, Long, CursoOnlineRepository> {

    public CursoOnlineService(CursoOnlineRepository repo) {
        super(repo);
    }

}
